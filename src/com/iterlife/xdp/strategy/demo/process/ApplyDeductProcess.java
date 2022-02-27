package com.iterlife.xdp.strategy.demo.process;

import com.iterlife.xdp.strategy.bizflow.AbstractBizFlowServiceImpl;
import com.iterlife.xdp.strategy.bizflow.ProcessResult;
import com.iterlife.xdp.strategy.demo.IDeductContextService;
import com.iterlife.xdp.strategy.demo.entity.DeductBill;
import com.iterlife.xdp.strategy.demo.entity.DeductResult;

/**
 * @desc: 扣款申请处理节点
 * @version: V1.0.0
 * @datetime: 2022/2/27 16:57
 **/
//@Service("applyDeductProcess")
public class ApplyDeductProcess extends AbstractBizFlowServiceImpl {

    //@Autowired
    private IDeductContextService deductService;

    /**
     * 还款业务通用入口
     *
     * @param deductBill 扣款单对象
     */
    @Override
    public ProcessResult process(DeductBill deductBill) {
        DeductResult deductResult = deductService.doDeducting(deductBill);
        //根据扣款进过执行做"扣款申请"相关的逻辑（略，注意边界仅限于"扣款申请"）
        return null;
    }
}
