package com.iterlife.xdp.decorator;


/**
 * @Description:com.iterlife.xdp.decorator.ConcreteDecoratorA
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-27 обнГ10:06:15
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteDecoratorA extends Decorator {

	/**
	 * @param component
	 */
	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	public void method() {
		System.out.println("ConcreteDecoratorA.method()");
	}

	public void operate() {
		this.method();
		super.operate();
	}

}
