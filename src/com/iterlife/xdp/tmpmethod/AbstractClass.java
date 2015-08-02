package com.iterlife.xdp.tmpmethod;


/**
 * @Description:com.iterlife.xdp.tmpmethod.AbstractClass
 * ģ�巽��:����һ�������е��㷨��ܣ�����һЩ�����ʵ���ӳٵ������У�ʹ��������Բ��ı�һ���㷨�Ľṹ�����ض�����㷨��һЩ�ض������ʵ�֡�
 * �ŵ�:��װ���䲿�֣���չ�ɱ䲿�֣���ȡ�������ִ��룬����ά������Ϊ�ɸ�����ƣ�����ʵ�֡�
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����10:07:46
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class AbstractClass {

	protected abstract void doSomething1();

	protected abstract void doSomething2();

	protected abstract void doSomething3();

	public void doSomething() {
		this.doSomething1();
		this.doSomething2();
		this.doSomething3();
	}
}
