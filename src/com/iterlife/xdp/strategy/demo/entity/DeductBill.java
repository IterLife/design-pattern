package com.iterlife.xdp.strategy.demo.entity;

/**
 * @desc:
 * @author: lujie
 * @version: V1.0.0
 * @datetime: 2022/2/27 16:31
 **/
public class DeductBill {

    private String deductBillNo;
    private String deductStatus;
    private String payChannel;
    private String payType;

    public String getDeductBillNo() {
        return deductBillNo;
    }

    public void setDeductBillNo(String deductBillNo) {
        this.deductBillNo = deductBillNo;
    }

    public String getDeductStatus() {
        return deductStatus;
    }

    public void setDeductStatus(String deductStatus) {
        this.deductStatus = deductStatus;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }


}
