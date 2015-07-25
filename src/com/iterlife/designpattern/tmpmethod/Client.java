package com.iterlife.designpattern.tmpmethod;


/**
 * @Description:com.iterlife.designpattern.tmpmethod.Client
 * ������ε�������ķ���:
 * 1-�����ഫ�ݵ�������вι��캯��
 * 2-ʹ�÷��䷽ʽ����
 * 3-�����������ľ�̬����
 * 4-ģ�巽��ģʽ
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����10:15:51
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {
	public static void main(String[] args) {
		AbstractClass clazz1 = new ConcreteClass1();
		AbstractClass clazz2 = new ConcreteClass2();
		clazz1.doSomething();
		clazz2.doSomething();
	}
}
