package com.iterlife.xdp.strategy.demo;

import com.iterlife.xdp.strategy.demo.entity.DeductBill;
import com.iterlife.xdp.strategy.demo.entity.DeductResult;

/**
 * @desc: 扣款模型
 **/
public interface IDeductPerformer {
    /**
     * 发送扣款渠道执行扣款操作
     *
     * @param deductBill 扣款单
     * @return 扣款结果对象（封装）
     */
    DeductResult doRepay(DeductBill deductBill);

    /**
     * 查询支付渠道扣款结果
     *
     * @param deductBill 扣款单
     * @return 扣款结果对象（封装）
     */
    DeductResult doQuery(DeductBill deductBill);
}