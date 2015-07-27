package com.iterlife.designpattern.strategy;


/**
 * @Description:com.iterlife.designpattern.strategy.Client
 * 
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 обнГ6:43:29
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context[] context = { new Context(new ConcreteStrategy1()), new Context(new ConcreteStrategy2()), new Context(new ConcreteStrategy3()) };
		for (int i = 0; i < 3; ++i) {
			context[i].doAnything();
		}

		System.out.println("2+5=" + new ApplicationContext(Calculator.ADD).exec(2, 5));
		System.out.println("5-2=" + new ApplicationContext(Calculator.SUB).exec(5, 2));

	}
}
