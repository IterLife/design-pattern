package com.iterlife.xdp.strategy.demo.process;


import com.iterlife.xdp.strategy.demo.bizflow.AbstractBizFlowServiceImpl;
import com.iterlife.xdp.strategy.demo.bizflow.ProcessResult;
import com.iterlife.xdp.strategy.demo.context.IDeductService;
import com.iterlife.xdp.strategy.demo.entity.DeductBill;
import com.iterlife.xdp.strategy.demo.entity.DeductResult;

/**
 * @desc: 扣款结果查询处理节点
 * @version: V1.0.0
 * @datetime: 2022/2/27 16:57
 **/
//@Service("queryDeductProcess")
public class QueryDeductProcess extends AbstractBizFlowServiceImpl {
    //@Autowired
    private IDeductService deductService;

    /**
     * 还款业务通用入口
     *
     * @param deductBill 扣款单对象
     */
    @Override
    public ProcessResult process(DeductBill deductBill) {
        if ("DEDUCTING" == deductBill.getDeductStatus()) {
            DeductResult deductResult = deductService.queryDeductResult(deductBill);
            if (!deductResult.isDeductFinished()) {
                //当前业务流程节点卡单
                return createPausedProcessResult("扣款结果未知，稍后重试");
            }
        }
        //验证或者处理扣款结果为终态相关的逻辑，业务流节点通过
        return createSuccessProcessResult();
    }
}
