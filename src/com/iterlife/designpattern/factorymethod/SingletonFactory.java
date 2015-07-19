package com.iterlife.designpattern.factorymethod;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.iterlife.designpattern.singleton.LazySingleton;

/**
 * @Description:com.iterlife.designpattern.factorymethod.SingletonFactory.java
 * 单例工厂模式
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 下午3:26:35
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class SingletonFactory {
	private static LazySingleton	singleton;
	{
		try {
			Class<?> clazz = Class.forName(LazySingleton.class.getName());
			// 获取无参构造函数
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			// 无参构造函数是private的，设置为可以访问的
			constructor.setAccessible(true);
			// 产生一个实例对象
			singleton = (LazySingleton) constructor.newInstance();
		} catch (ClassNotFoundException e) {
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
		} catch (IllegalArgumentException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		} catch (InvocationTargetException e) {
		}
	}

	public LazySingleton getInstaSingleton() {
		return singleton;
	}
}
