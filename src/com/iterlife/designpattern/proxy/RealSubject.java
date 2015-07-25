package com.iterlife.designpattern.proxy;


/**
 * @Description:com.iterlife.designpattern.proxy.RealSubject
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
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
