package ai.ii.excel.myhexin.circle;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author qiyu
 * @since 2023/6/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CircleUserDTO implements Serializable {
    
    private static final long serialVersionUID = 7856368152525225874L;
    
    @ExcelProperty("昵称")
    private String nickname;
    
    @ExcelProperty("用户id")
    @JsonProperty("user_id")
    private Long userId;
    
    @ExcelProperty("简介")
    private String description;
    
    @ExcelProperty("是否大v")
    @JsonProperty("is_v")
    private Integer isV;
    
    @ExcelProperty("个人主页地址")
    @JsonProperty("mobile_user_home_page")
    private String mobileUserHomePage;
    
    @ExcelProperty("头像")
    private String avatar;
    
    @ExcelIgnore
    private Long id;
}
