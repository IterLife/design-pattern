package com.iterlife.xdp.decorator;


/**
 * @Description:com.iterlife.xdp.decorator.ConcreteDecoratorB
 *
 * @author:Lu Jie
 * @date:2015-7-27 обнГ10:08:12
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	public void method() {
		System.out.println("ConcreteDecoratorB.method()");
	}

	public void operate() {
		this.method();
		super.operate();
	}
}
