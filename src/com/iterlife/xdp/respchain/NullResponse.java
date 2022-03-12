package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.NullResponse
 *
 * @author:Lu Jie
 * @date:2015-8-2 上午11:07:51
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class NullResponse extends Response {
	public NullResponse() {
		super.setResponseDesc("找不到相应级别的处理对象");
	}
}
