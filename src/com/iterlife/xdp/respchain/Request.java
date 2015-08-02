package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.Request
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ����10:41:38
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */

public abstract class Request {
	// ����Ϊabstract�����ҪĿ����Ϊ����ʵ����
	private HandlerLevelEnum	handlerLevelEnum;

	/**
	 * @return the handlerLevelEnum
	 */
	public HandlerLevelEnum getHandlerLevelEnum() {
		return handlerLevelEnum;
	}

	/**
	 * @param handlerLevelEnum the handlerLevelEnum to set
	 */
	public void setHandlerLevelEnum(HandlerLevelEnum handlerLevelEnum) {
		this.handlerLevelEnum = handlerLevelEnum;
	}

}
