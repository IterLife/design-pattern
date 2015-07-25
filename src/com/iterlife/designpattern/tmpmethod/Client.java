package com.iterlife.designpattern.tmpmethod;


/**
 * @Description:com.iterlife.designpattern.tmpmethod.Client
 * 父类如何调用子类的方法:
 * 1-把子类传递到父类的有参构造函数
 * 2-使用反射方式调用
 * 3-父类调用子类的静态方法
 * 4-模板方法模式
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 上午10:15:51
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {
	public static void main(String[] args) {
		AbstractClass clazz1 = new ConcreteClass1();
		AbstractClass clazz2 = new ConcreteClass2();
		clazz1.doSomething();
		clazz2.doSomething();
	}
}
