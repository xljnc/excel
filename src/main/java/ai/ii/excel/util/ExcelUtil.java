package ai.ii.excel.util;

import ai.ii.excel.dto.ExcelWriteDTO;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author qiyu
 * @date 2019/9/1 17:10
 * @description
 */
@Slf4j
public class ExcelUtil {


    public static void writeExcel(ExcelWriteDTO writeDTO) {
        try (OutputStream outputStream = new FileOutputStream(writeDTO.getFileName());) {
            ExcelWriter excelWriter = EasyExcel.write
        } catch (Exception e) {
            log.error("写入Excel失败,参数:{}", JSON.toJSONString(writeDTO), e);
        }

    }
}
