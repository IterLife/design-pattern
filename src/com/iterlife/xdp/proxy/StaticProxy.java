package com.iterlife.xdp.proxy;


/**
 * @Description:com.iterlife.xdp.proxy.StaticProxy
 *
 * @author:Lu Jie
 * @date:2015-7-25 ÏÂÎç12:49:49
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class StaticProxy implements Subject {
	Subject	subject	= null;

	public StaticProxy() {
		this.subject = new Subject() {
			public void request() {
				System.out.println("Default realSubject......");
			}
		};
	}

	public StaticProxy(Subject subject) {
		this.subject = subject;
	}

	public void request() {
		this.before();
		subject.request();
		this.after();
	}

	public void before() {
		System.out.println("Proxy.before()");
	}

	public void after() {
		System.out.println("Proxy.after()");
	}
}
