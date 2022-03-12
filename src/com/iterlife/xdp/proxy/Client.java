package com.iterlife.xdp.proxy;



/**
 * @Description:com.iterlife.xdp.proxy.Client
 * 代理模式:为其他对象提供一种代理以控制对这个对象的访问
 * 优点:职责清晰，高扩展性，智能化
 * @author:Lu Jie
 * @date:2015-7-25 下午12:55:49
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
