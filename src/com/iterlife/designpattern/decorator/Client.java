package com.iterlife.designpattern.decorator;


/**
 * @Description:com.iterlife.designpattern.decorator.Client
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 обнГ6:37:44
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
