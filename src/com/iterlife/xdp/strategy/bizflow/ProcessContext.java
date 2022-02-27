package com.iterlife.xdp.strategy.bizflow;

/**
 * @desc:
 * @author: lujie
 * @version: V1.0.0
 * @datetime: 2022/2/27 17:07
 **/
public interface ProcessContext<RequestParamT> {

    default public RequestParamT getRequestParam() {
        return null;
    }
}
