package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.OneLevelRequest
 *
 * @author:Lu Jie
 * @date:2015-8-2 ионГ10:45:59
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class OneLevelRequest extends Request {

	public OneLevelRequest() {
		super.setHandlerLevelEnum(HandlerLevelEnum.ONE);
	}
}
