package com.iterlife.xdp.facade;


/**
 * @Description:com.iterlife.xdp.facade.Facade
 * ����ģʽ:Ҫ��һ����ϵͳ���ⲿ�����ڲ���ͨ�ű���ͨ��һ��ͳһ�Ķ�����У�����ģʽ�ṩһ���߲�εĽӿڣ�ʹ����ϵͳ������ʹ��
 * ����ϵͳ���໥����
 * ��������
 * ��߰�ȫ��
 * 
 * �������ֻ���ṩ������ϵͳ�Ľӿڣ�����Ӧ�ð���ҵ���߼�
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ����4:29:43
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Facade {
	SystemA	systemA	= new SystemA();
	SystemB	systemB	= new SystemB();
	SystemC	systemC	= new SystemC();

	public void doSomethingA() {
		systemA.doSomething();
	}

	public void doSomethingB() {
		systemB.doSomething();
	}

	public void doSomethingC() {
		systemC.doSomething();
	}
}
