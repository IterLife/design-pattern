package com.iterlife.xdp.respchain;


import java.util.Random;

/**
 * @Description:com.iterlife.xdp.respchain.FourLevelHandler
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ����11:33:53
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
			System.out.println("��һЩ�ļ��������������顭��");
			System.out.println("[" + fourLeverHandler.getLevelDesc() + "]:" + resonse.getResponseDesc());
			return resonse;
		}
		if (this.getNextHandler() == null) {
			System.out.println("�ļ��������޷������Ҳ�����һ������");
			return new NullResponse();
		}
		System.out.println("�ļ��������޷������ύ����һ������");
		return this.getNextHandler().handler(request);
	}
}
