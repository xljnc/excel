package ai.ii.excel.myhexin.circle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author qiyu
 * @since 2023/6/8
 */
@Data
public class CirclePage<T extends  Serializable> implements Serializable {
    
    private static final long serialVersionUID = -3579014347756908991L;
    
    @JsonProperty("page_id")
    private Integer pageNum;
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    private Long total;
    
    private Integer pages;
    
    private List<T> data;
}
