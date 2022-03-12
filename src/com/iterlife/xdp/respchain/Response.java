package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.Response
 *
 * @author:Lu Jie
 * @date:2015-8-2 上午10:41:46
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class Response {
	
	protected String responseDesc;

	/**
	 * @return the responseDesc
	 */
	public String getResponseDesc() {
		return responseDesc;
	}

	/**
	 * @param responseDesc the responseDesc to set
	 */
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	
}
