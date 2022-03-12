package com.iterlife.xdp.singleton;


/**
 * @Description:com.iterlife.xdp.singleton.HungrySingleton
 * 饿汉单例模式
 * @author:Lu Jie
 * @date:2015-7-19 下午2:34:10
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class HungrySingleton {
	public static final HungrySingleton	singleton	= new HungrySingleton();

	// 限制产生多个对象
	private HungrySingleton() {

	}

	public static HungrySingleton getSingleton() {
		return singleton;
	}

	public static void doSomething() {

	}
}
