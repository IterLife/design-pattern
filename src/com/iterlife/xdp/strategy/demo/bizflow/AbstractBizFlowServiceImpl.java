package com.iterlife.xdp.strategy.demo.bizflow;

import com.iterlife.xdp.strategy.demo.entity.DeductBill;

/**
 * @desc: Bizflow 业务流程处理逻辑
 * @author: lujie
 * @version: V1.0.0
 * @datetime: 2022/2/27 16:58
 **/
public abstract class AbstractBizFlowServiceImpl {

    protected ProcessResult doProcess(ProcessContext<DeductBill> processContext, DeductBill deductBill) {
        //初始化非业务变量
        initFacts(processContext);
        //统一预监控，可重写
        preMonitor(deductBill);
        //预处理
        preProcess(deductBill);
        //业务处理节点
        ProcessResult result = process(deductBill);
        //统一更新异常处理结果信息
        refreshProcessResult(result);
        //后处理
        postProcess(deductBill);
        //统一后监控，可重写
        postMonitor(deductBill);
        //统一销毁业务变量
        refreshDeductBill(deductBill);
        //统一销毁非业务变量
        refreshFacts(processContext);
        //统一销毁Bizflow控制对象
        refreshProcessContext(processContext);
        return result;

    }


    public void initFacts(ProcessContext<DeductBill> processContext) {

    }


    public void preMonitor(DeductBill DeductBill) {

    }

    public void preProcess(DeductBill DeductBill) {
    }

    /**
     * 还款业务通用入口
     */
    public abstract ProcessResult process(DeductBill DeductBill);


    public void refreshProcessResult(ProcessResult result) {

    }


    public void postProcess(DeductBill DeductBill) {
    }

    public void postMonitor(DeductBill DeductBill) {
    }


    public void refreshDeductBill(DeductBill DeductBill) {

    }

    public void refreshFacts(ProcessContext<DeductBill> processContext) {
    }

    public void refreshProcessContext(ProcessContext<DeductBill> processContext) {

    }

    public static ProcessResult createInitProcessResult() {
        return null;
    }

    public static ProcessResult createSuccessProcessResult() {
        return null;
    }

    public static ProcessResult createErrorProcessResult(String errorMessage) {
        return null;
    }

    public static ProcessResult createPausedProcessResult(String pauseMessage) {
        return null;
    }

}
