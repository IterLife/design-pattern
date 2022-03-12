package com.iterlife.xdp.respchain;


import java.util.Random;

/**
 * @Description:com.iterlife.xdp.respchain.FourLevelHandler
 *
 * @author:Lu Jie
 * @date:2015-8-2 上午11:33:53
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class FourLevelHandler extends Handler {

	private static HandlerLevelEnum	fourLeverHandler	= HandlerLevelEnum.FOUR;

	@Override
	public HandlerLevelEnum getHandLevelEnum() {
		return fourLeverHandler;
	}

	@Override
	public Response handler(Request request) {
		if (this.getHandLevelEnum().canHandler(request.getHandlerLevelEnum())) {
			Random random = new Random();
			Response resonse = response[random.nextInt(2)];
			System.out.println("做一些四级处理级别做的事情……");
			System.out.println("[" + fourLeverHandler.getLevelDesc() + "]:" + resonse.getResponseDesc());
			return resonse;
		}
		if (this.getNextHandler() == null) {
			System.out.println("四级处理级别无法处理，找不到下一处理级别。");
			return new NullResponse();
		}
		System.out.println("四级处理级别无法处理，提交到下一处理级别。");
		return this.getNextHandler().handler(request);
	}
}
