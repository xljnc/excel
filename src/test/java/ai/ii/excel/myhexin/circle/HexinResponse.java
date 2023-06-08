package ai.ii.excel.myhexin.circle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author qiyu
 * @since 2023/6/8
 */
@Data
public class HexinResponse<T> {
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    @JsonProperty("status_msg")
    private String statusMsg;
    
    private T data;
}
