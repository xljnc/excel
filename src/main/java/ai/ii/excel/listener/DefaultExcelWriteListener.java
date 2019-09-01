package ai.ii.excel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

/**
 * @author qiyu
 * @date 2019/9/1 21:27
 * @description
 */
public class DefaultExcelWriteListener<T> extends AnalysisEventListener<T> {
    @Override
    public void invoke(T data, AnalysisContext context) {

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
