package com.iterlife.xdp.proxy;


import java.lang.reflect.InvocationHandler;

/**
 * @Description:com.iterlife.xdp.proxy.SubjectDynamicProxy
 * 
 * @author:Lu Jie
 * @date:2015-7-25 обнГ4:19:12
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class SubjectDynamicProxy<T> extends DynamicProxy<T> {

	@SuppressWarnings("rawtypes")
	public static <T> T newProxyInstance(Subject subject) {
		ClassLoader loader = subject.getClass().getClassLoader();
		Class[] clazz = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, clazz, handler);
	}
}
