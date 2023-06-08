package ai.ii.excel.myhexin.circle;

import ai.ii.excel.util.HttpClientUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author qiyu
 * @since 2023/6/8
 */
@Slf4j
public class CircleUserExport {
    
    public static void main(String[] args) {
//        String url = "https://test.touzime.com/lgt/user-circle/open/api/circle/v1/page_member";
//        String circleCode = "rxjuj6";
        String url = "https://community.touzime.com/lgt/user-circle/open/api/circle/v1/page_member";
        String circleCode = "npbsx9";
        String fileName = "期货圈友.xlsx";
        CircleUserPageParam pageParam = CircleUserPageParam.builder().circleCode(circleCode).pageSize(20).build();
        try (ExcelWriter excelWriter = EasyExcel.write(fileName, CircleUserDTO.class).build()) {
            WriteSheet writeSheet = EasyExcel.writerSheet("圈友").build();
            while (true) {
                String param = JacksonUtil.writeValueAsString(pageParam);
                String pageResult = HttpClientUtil.httpPostJson(url, param);
                if (StringUtils.isBlank(pageResult)) {
                    log.info("请求圈子成员返回空，结束循环");
                    break;
                }
                HexinResponse<CirclePage<CircleUserDTO>> hxResponse = JacksonUtil.readValue(pageResult, new TypeReference<HexinResponse<CirclePage<CircleUserDTO>>>() {
                });
                List<CircleUserDTO> circleUserList = Optional.of(hxResponse).filter(response -> response.getStatusCode() == 0).map(HexinResponse::getData).map(CirclePage::getData).orElse(Collections.emptyList());
                if (CollectionUtils.isEmpty(circleUserList))
                    break;
                excelWriter.write(circleUserList, writeSheet);
                Long lastId = circleUserList.get(circleUserList.size() - 1).getId();
                if (lastId == null)
                    break;
                pageParam.setLastId(lastId);
            }
        } catch (Exception e) {
            log.error("请求圈子成员异常", e);
        }
    }
}
