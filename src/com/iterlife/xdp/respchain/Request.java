package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.Request
 *
 * @author:Lu Jie
 * @date:2015-8-2 上午10:41:38
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */

public abstract class Request {
	// 定义为abstract类的主要目的是为不被实例化
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
