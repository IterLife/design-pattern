package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.TwoLevelRequest
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ионГ10:48:55
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class TwoLevelRequest extends Request {

	public TwoLevelRequest() {
		super.setHandlerLevelEnum(HandlerLevelEnum.TWO);
	}

}
