package com.iterlife.designpattern.strategy;


/**
 * @Description:com.iterlife.designpattern.strategy.Context
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-27 обнГ8:44:19
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Context {

	private Strategy	strategy	= null;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void doAnything() {
		this.strategy.doSomething();
	}
}
