package com.iterlife.designpattern.strategy;


/**
 * @Description:com.iterlife.designpattern.strategy.ApplicationContext
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-27 обнГ9:16:35
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
