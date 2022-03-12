package com.iterlife.xdp.strategy;


/**
 * @Description:com.iterlife.xdp.strategy.ApplicationContext
 *
 * @author:Lu Jie
 * @date:2015-7-27 下午9:16:35
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ApplicationContext {
	private Calculator	calc;

	public ApplicationContext(Calculator calc) {
		this.calc = calc;
	}

	public int exec(int a, int b) {
		return this.calc.exec(a, b);
	}
}
