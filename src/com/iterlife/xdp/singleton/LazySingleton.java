package com.iterlife.xdp.singleton;


/**
 * @Description:com.iterlife.xdp.singleton.LazySingleton
 * ��������ģʽ
 * ����ģʽ:ȷ��ĳ����ֻ��һ��ʵ������������ʵ������������ϵͳ�ṩ���ʵ��
 * �ŵ�:��פ�ڴ棬����ϵͳ���ܿ���
 * ȷ��:û�нӿڣ���չ���ѣ��뵥һְ��ԭ���ͻ
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 ����2:06:25
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class LazySingleton {

	private static LazySingleton	singleton	= null;

	private LazySingleton() {
		// ����public Singleton()���췽��
		// ���Խ���ǰSingleton������Ϊabstract,���䲻�ɱ�ʵ����
	}

	/**
	 * ��������´�������,ͨ���Է������߳�������synchronized�ؼ��ֽ��
	 **/
	public static LazySingleton getInstance() {
		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}

	public static void doSomething() {

	}
}
