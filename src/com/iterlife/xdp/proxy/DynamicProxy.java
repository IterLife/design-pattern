package com.iterlife.xdp.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description:com.iterlife.xdp.proxy.DynamicProxy
 *
 * @author:Lu Jie
 * @date:2015-7-25 下午3:57:22
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class DynamicProxy<T> {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler handler) {
		return ((T) Proxy.newProxyInstance(loader, interfaces, handler));
	}
}
