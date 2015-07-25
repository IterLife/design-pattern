package com.iterlife.designpattern.tmpmethod;


/**
 * @Description:com.iterlife.designpattern.tmpmethod.ConcreteClass1
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ионГ10:12:55
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteClass1 extends AbstractClass {

	@Override
	protected void doSomething1() {
		System.out.println("ConcreteClass1.doSomething1()");
	}

	@Override
	protected void doSomething2() {
		System.out.println("ConcreteClass1.doSomething2()");
	}

	@Override
	protected void doSomething3() {
		System.out.println("ConcreteClass1.doSomething3()");
	}

}
