package com.iterlife.designpattern.proxy;



/**
 * @Description:com.iterlife.designpattern.proxy.Client
 * ����ģʽ:Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ���
 * �ŵ�:ְ������������չ�ԣ����ܻ�
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����12:55:49
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	public static void main(String[] args) {
		// Subject proxy = new Proxy(new RealSubject());
		// proxy.request();
		Subject proxy = (Subject) SubjectDynamicProxy.newProxyInstance(new RealSubject());
		proxy.request();

	}
}
