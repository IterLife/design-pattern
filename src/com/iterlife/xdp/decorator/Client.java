package com.iterlife.xdp.decorator;


/**
 * @Description:com.iterlife.xdp.decorator.Client
 *
 * @author:Lu Jie
 * @date:2015-7-25 下午6:37:44
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decorator1 = new ConcreteDecoratorA(component);
		Decorator decorator2 = new ConcreteDecoratorB(component);
		decorator1.operate();
		decorator2.operate();
	}

}
