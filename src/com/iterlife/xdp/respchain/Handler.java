package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.Handler
 * ������ģʽ:ʹ��������л��ᴦ�����󣬴Ӷ�����������ķ����ߺͽ�����֮�����Ϲ�ϵ��������������һ�����������Ÿ������͸�����ֱ���ж�������λ��
 * ������ʹ���ֿ������Ƶݹ鵼����������͵��Բ���
 * 
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ����10:30:39
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */

// ��������
public abstract class Handler {

	private Handler	nextHandler;	// ������һ��������

	public abstract HandlerLevelEnum getHandLevelEnum();// �����ܴ����״������С����

	public abstract Response handler(Request request);// ���崦����

	public static Response[]	response	= new Response[] { new YesResponse(), new NoResponse() };

	/**
	 * @param nextHandler the nextHandler to set
	 */
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public final Response handlerRequest(Request request) {
		return this.handler(request);
	}

	/**
	 * @return the nextHandler
	 */
	public Handler getNextHandler() {
		return nextHandler;
	}

}
