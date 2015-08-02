package com.iterlife.xdp.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description:com.iterlife.xdp.singleton.ExtSingleton
 * 有上限的扩展单例模式
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 下午2:22:48
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ExtSingleton {

	private static final int			MAX_SINGLETON_INSTANCE	= 3;
	private static List<ExtSingleton>	singletonList			= new ArrayList<ExtSingleton>();

	static {
		for (int i = 0; i < MAX_SINGLETON_INSTANCE; ++i) {
			singletonList.add(new ExtSingleton("ExtSingleton" + i));
		}
	}

	private ExtSingleton() {

	}

	private ExtSingleton(String singletonTag) {
		System.out.println("生成一个实例，标识:" + singletonTag);
	}

	public static ExtSingleton getExtSingleton() {
		Random random = new Random();
		int singletonCounter = random.nextInt(MAX_SINGLETON_INSTANCE);
		return singletonList.get(singletonCounter);
	}

	public static void doSomething() {

	}
}
