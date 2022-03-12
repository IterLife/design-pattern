package com.iterlife.xdp.tmpmethod;


/**
 * @Description:com.iterlife.xdp.tmpmethod.AbstractClass
 * 模板方法:定义一个操作中的算法框架，而将一些步骤的实现延迟到子类中，使得子类可以不改变一个算法的结构即可重定义该算法的一些特定步骤的实现。
 * 优点:封装不变部分，扩展可变部分；提取公共部分代码，便于维护；行为由父类控制，子类实现。
 * @author:Lu Jie
 * @date:2015-7-25 上午10:07:46
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class AbstractClass {

	protected abstract void doSomething1();

	protected abstract void doSomething2();

	protected abstract void doSomething3();

	public void doSomething() {
		this.doSomething1();
		this.doSomething2();
		this.doSomething3();
	}
}
