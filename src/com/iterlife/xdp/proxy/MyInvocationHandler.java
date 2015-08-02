package com.iterlife.xdp.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:com.iterlife.xdp.proxy.MyInvocationHandler
 * ��̬����
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����3:48:49
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class MyInvocationHandler implements InvocationHandler {

	// ���������
	private Object	target	= null;

	public MyInvocationHandler(Object object) {
		this.target = object;
	}

	// ������
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("MyInvocationHandler.invoke()");
		return method.invoke(this.target, args);
	}

}
