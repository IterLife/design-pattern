package com.iterlife.xdp.strategy;


/**
 * @Description:com.iterlife.xdp.strategy.Context
 *
 * @author:Lu Jie
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
