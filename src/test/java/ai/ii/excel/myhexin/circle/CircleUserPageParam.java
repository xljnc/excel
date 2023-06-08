package ai.ii.excel.myhexin.circle;

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
public class CircleUserPageParam implements Serializable {
    
    @JsonProperty("circle_code")
    private String circleCode;
    
    @JsonProperty("page_size")
    private Integer pageSize = 20;
    
    @JsonProperty("last_id")
    private Long lastId;
}
