package com.iterlife.xdp.strategy.demo.process;

import com.iterlife.xdp.strategy.demo.bizflow.AbstractBizFlowServiceImpl;
import com.iterlife.xdp.strategy.demo.bizflow.ProcessContext;
import com.iterlife.xdp.strategy.demo.bizflow.ProcessResult;
import com.iterlife.xdp.strategy.demo.entity.DeductBill;

import java.util.List;

/**
 * @desc:扣款渠道选择
 **/
//@Service("channelInitProcess")
public class ChannelInitProcess extends AbstractBizFlowServiceImpl {

    //@Autowired
    private IDeductBillService deductBillService;

    @Override
    public void initFacts(ProcessContext<DeductBill> processContext) {
        //根据上下文获取本次还款所有待扣款状态的扣款单列表
        List<DeductBill> unDeductBillList = deductBillService.getDeductBillList(processContext.getRequestParam().getBizSerial(), "INIT");
        //模拟所有扣款单扣款成功与否，其获取当前第一个待扣款的扣款单
        processContext.getFacts().put("DEDUCT_FINISHED", unDeductBillList.isEmpty());
        processContext.getFacts().put("NEXT_DEDUCT_BILL_NO", unDeductBillList.isEmpty() ? null : unDeductBillList.get(0).getDeductBillNo());
        super.initFacts(processContext);
    }

    /**
     * 还款业务通用入口
     *
     * @param DeductBill
     */
    @Override
    public ProcessResult process(DeductBill DeductBill) {
        return createSuccessProcessResult();
    }
}
