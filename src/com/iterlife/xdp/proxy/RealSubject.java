package com.iterlife.xdp.proxy;


/**
 * @Description:com.iterlife.xdp.proxy.RealSubject
 *
 * @author:Lu Jie
 * @date:2015-7-25 обнГ12:48:41
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("RealSubject.request()");
	}

}
