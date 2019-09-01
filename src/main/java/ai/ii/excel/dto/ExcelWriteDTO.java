package ai.ii.excel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author qiyu
 * @date 2019/9/1 17:35
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExcelWriteDTO implements Serializable {
    private static final long serialVersionUID = -9019267960561780505L;

    /**
     * 文件名
     */
    @NotBlank(message = "文件名不能为空")
    private String fileName;

    /**
     * 数据列表
     */
    private List<?> dataList;
}
