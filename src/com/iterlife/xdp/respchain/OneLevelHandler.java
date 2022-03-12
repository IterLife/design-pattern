package com.iterlife.xdp.respchain;


import java.util.Random;

public class OneLevelHandler extends Handler {

	private static HandlerLevelEnum	oneLeverHandler	= HandlerLevelEnum.ONE;

	@Override
	public HandlerLevelEnum getHandLevelEnum() {
		super.setNextHandler(new TwoLevelHandler());
		return oneLeverHandler;
	}

	@Override
	public Response handler(Request request) {
		if (this.getHandLevelEnum().canHandler(request.getHandlerLevelEnum())) {
			Random random = new Random();
			Response resonse = response[random.nextInt(2)];
			System.out.println("做一些一级处理级别做的事情……");
			System.out.println("[" + oneLeverHandler.getLevelDesc() + "]:" + resonse.getResponseDesc());
			return resonse;
		}
		if (this.getNextHandler() == null) {
			System.out.println("一级处理级别无法处理，找不到下一处理级别。");
			return new NullResponse();
		}
		System.out.println("一级处理级别无法处理，提交到下一处理级别。");
		return this.getNextHandler().handler(request);
	}
}
