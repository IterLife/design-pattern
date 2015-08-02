package com.iterlife.xdp.respchain;


import java.util.Random;

/**
 * @Description:com.iterlife.xdp.respchain.ThreeLevelHandler
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ����11:32:16
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
			System.out.println("��һЩ�����������������顭��");
			System.out.println("[" + threeeLeverHandler.getLevelDesc() + "]:" + resonse.getResponseDesc());
			return resonse;
		}
		if (this.getNextHandler() == null) {
			System.out.println("�����������޷������Ҳ�����һ������");
			return new NullResponse();
		}
		System.out.println("�����������޷������ύ����һ������");
		return this.getNextHandler().handler(request);
	}

}
