package com.iterlife.designpattern.singleton;


/**
 * @Description:com.iterlife.designpattern.singleton.HungrySingleton.java
 * ��������ģʽ
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 ����2:34:10
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class HungrySingleton {
	public static final HungrySingleton	singleton	= new HungrySingleton();

	// ���Ʋ����������
	private HungrySingleton() {

	}

	public static HungrySingleton getSingleton() {
		return singleton;
	}

	public static void doSomething() {

	}
}
