package com.iterlife.xdp.respchain;


import java.util.Random;

/**
 * @Description:com.iterlife.xdp.respchain.ThreeLevelHandler
 *
 * @author:Lu Jie
 * @date:2015-8-2 上午11:32:16
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ThreeLevelHandler extends Handler {
	private static HandlerLevelEnum	threeeLeverHandler	= HandlerLevelEnum.THREE;

	@Override
	public HandlerLevelEnum getHandLevelEnum() {
		super.setNextHandler(new FourLevelHandler());
		return threeeLeverHandler;
	}

	@Override
	public Response handler(Request request) {
		if (this.getHandLevelEnum().canHandler(request.getHandlerLevelEnum())) {
			Random random = new Random();
			Response resonse = response[random.nextInt(2)];
			System.out.println("做一些三级处理级别做的事情……");
			System.out.println("[" + threeeLeverHandler.getLevelDesc() + "]:" + resonse.getResponseDesc());
			return resonse;
		}
		if (this.getNextHandler() == null) {
			System.out.println("三级处理级别无法处理，找不到下一处理级别。");
			return new NullResponse();
		}
		System.out.println("三级处理级别无法处理，提交到下一处理级别。");
		return this.getNextHandler().handler(request);
	}

}
