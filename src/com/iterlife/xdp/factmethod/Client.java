package com.iterlife.xdp.factmethod;


/**
 * @Description:com.iterlife.xdp.factmethod.Client
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 ÏÂÎç3:00:57
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {
	public static void main(String[] args) {
		AbstarctProductFactory factory = new ConcreteProductFactory();
		factory.createProduct(ConcreteProcuctA.class).doSomething1();
		factory.createProduct(ConcreteProcuctB.class).doSomething2();
		SimpleProductFactory.createProduct(ConcreteProcuctA.class).doSomething2();
		SimpleProductFactory.createProduct(ConcreteProcuctB.class).doSomething1();

		new ConcreteProcuctAFactory().createProduct().doSomething1();
		new ConcreteProcuctBFactory().createProduct().doSomething1();
	}

}
