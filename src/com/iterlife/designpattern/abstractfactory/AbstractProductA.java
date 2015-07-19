package com.iterlife.designpattern.abstractfactory;


/**
 * @Description:com.iterlife.designpattern.abstractfactory.AbstractProductA.java
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 обнГ7:16:40
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class AbstractProductA {

	public void shareMethod() {
		System.out.println("AbstractProductA.shareMethod()");
	}

	public abstract void doSomething();
}
