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
			System.out.println("��һЩһ���������������顭��");
			System.out.println("[" + oneLeverHandler.getLevelDesc() + "]:" + resonse.getResponseDesc());
			return resonse;
		}
		if (this.getNextHandler() == null) {
			System.out.println("һ���������޷������Ҳ�����һ������");
			return new NullResponse();
		}
		System.out.println("һ���������޷������ύ����һ������");
		return this.getNextHandler().handler(request);
	}
}
