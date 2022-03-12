package com.iterlife.xdp.singleton;


/**
 * @Description:com.iterlife.xdp.singleton.LazySingleton
 * 懒汉单例模式
 * 单例模式:确保某个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * 优点:长驻内存，减少系统性能开销
 * 确定:没有接口，扩展困难；与单一职责原则冲突
 * @author:Lu Jie
 * @date:2015-7-19 下午2:06:25
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class LazySingleton {

	private static LazySingleton	singleton	= null;

	private LazySingleton() {
		// 屏蔽public Singleton()构造方法
		// 可以将当前Singleton类设置为abstract,则其不可被实例化
	}

	/**
	 * 并发情况下存在问题,通过对方法或者程序块添加synchronized关键字解决
	 **/
	public static LazySingleton getInstance() {
		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}

	public static void doSomething() {

	}
}
