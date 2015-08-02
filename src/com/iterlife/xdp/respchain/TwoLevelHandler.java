package com.iterlife.xdp.respchain;


import java.util.Random;

/**
 * @Description:com.iterlife.xdp.respchain.TwoLevelHandler
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 上午11:28:54
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class TwoLevelHandler extends Handler {

	private static HandlerLevelEnum	twoLeverHandler	= HandlerLevelEnum.TWO;

	@Override
	public HandlerLevelEnum getHandLevelEnum() {
		super.setNextHandler(new ThreeLevelHandler());
		return twoLeverHandler;
	}

	@Override
	public Response handler(Request request) {
		if (this.getHandLevelEnum().canHandler(request.getHandlerLevelEnum())) {
			Random random = new Random();
			Response resonse = response[random.nextInt(2)];
			System.out.println("做一些二级处理级别做的事情……");
			System.out.println("[" + twoLeverHandler.getLevelDesc() + "]:" + resonse.getResponseDesc());
			return resonse;
		}
		if (this.getNextHandler() == null) {
			System.out.println("二级处理级别无法处理，找不到下一处理级别。");
			return new NullResponse();
		}
		System.out.println("二级处理级别无法处理，提交到下一处理级别。");
		return this.getNextHandler().handler(request);
	}
}
