package com.iterlife.xdp.strategy.demo.context;

import com.iterlife.xdp.strategy.demo.entity.DeductBill;
import com.iterlife.xdp.strategy.demo.entity.DeductResult;

/**
 * @desc:
 * @author: lujie
 * @version: V1.0.0
 * @datetime: 2022/2/27 18:03
 **/
public interface IDeductContextService {

    DeductResult doDeducting(DeductBill deductBill);

    DeductResult queryDeductResult(DeductBill deductBill);
}
