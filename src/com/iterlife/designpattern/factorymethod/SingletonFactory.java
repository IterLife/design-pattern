package com.iterlife.designpattern.factorymethod;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.iterlife.designpattern.singleton.LazySingleton;

/**
 * @Description:com.iterlife.designpattern.factorymethod.SingletonFactory.java
 * ��������ģʽ
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 ����3:26:35
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class SingletonFactory {
	private static LazySingleton	singleton;
	{
		try {
			Class<?> clazz = Class.forName(LazySingleton.class.getName());
			// ��ȡ�޲ι��캯��
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			// �޲ι��캯����private�ģ�����Ϊ���Է��ʵ�
			constructor.setAccessible(true);
			// ����һ��ʵ������
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
