package ai.ii.excel.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author qiyu
 * @date 2019/9/1 17:17
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    /**
     * 名称
     */
    @ExcelProperty(value = "名称", index = 0)
    private String name;
    /**
     * 发布日期
     */
    @ExcelProperty(value = "发布日期", index = 1)
    private Date publishTime;
    /**
     * 价格
     */
    @ExcelProperty(value = "价格", index = 2)
    private BigDecimal price;
}
