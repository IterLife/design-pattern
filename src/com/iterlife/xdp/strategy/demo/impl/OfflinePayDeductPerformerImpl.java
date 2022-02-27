package com.iterlife.xdp.strategy.demo.impl;

import com.iterlife.xdp.strategy.demo.IDeductPerformer;
import com.iterlife.xdp.strategy.demo.entity.DeductBill;
import com.iterlife.xdp.strategy.demo.entity.DeductResult;

/**
 * @desc:对公还款类
 **/
public class OfflinePayDeductPerformerImpl implements IDeductPerformer {
    /**
     * 发送扣款渠道执行扣款操作
     *
     * @param deductBill 扣款单
     * @return 扣款结果对象（封装）
     */
    @Override
    public DeductResult doRepay(DeductBill deductBill) {
        return null;
    }

    /**
     * 查询支付渠道扣款结果
     *
     * @param deductBill 扣款单
     * @return 扣款结果对象（封装）
     */
    @Override
    public DeductResult doQuery(DeductBill deductBill) {
        return null;
    }
}
