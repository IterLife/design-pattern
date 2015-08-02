package com.iterlife.xdp.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:com.iterlife.xdp.proxy.MyInvocationHandler
 * 动态代理
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 下午3:48:49
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class MyInvocationHandler implements InvocationHandler {

	// 被代理对象
	private Object	target	= null;

	public MyInvocationHandler(Object object) {
		this.target = object;
	}

	// 代理方法
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("MyInvocationHandler.invoke()");
		return method.invoke(this.target, args);
	}

}
