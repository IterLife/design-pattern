package com.iterlife.xdp.respchain;


import java.util.Random;

/**
 * @Description:com.iterlife.xdp.respchain.Client
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����6:40:04
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Request request[] = new Request[] { new OneLevelRequest(), new TwoLevelRequest(), new ThreeLevelRequest(), new FourLevelRequest(),
				new FiveLevelRequest() };
		Handler dealHandler = new OneLevelHandler();// �����������Handler
		for (int i = 0; i < 100; ++i) {
			Random random = new Random();
			int requestIndex = random.nextInt(5);
			System.out.println("��" + (i+1)+ "�η����������󼶱�:" + request[requestIndex].getHandlerLevelEnum());
			System.out.println("���봦�����̡���");
			Response response = dealHandler.handlerRequest(request[requestIndex]);
			System.out.println("[���մ�����]:" + response.getResponseDesc());
			System.out.println("������������������������������������������������������������������������������������������������\n\n");
		}
	}
}
