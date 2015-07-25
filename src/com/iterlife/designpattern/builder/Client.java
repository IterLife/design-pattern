package com.iterlife.designpattern.builder;


/**
 * @Description:com.iterlife.designpattern.builder.Client.java
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ионГ11:11:13
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Director director = new Director();
		director.getProductA().doSomething();
		director.getProductB().doSomething();

	}

}
