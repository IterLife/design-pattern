package com.iterlife.designpattern.strategy;


/**
 * @Description:com.iterlife.designpattern.strategy.Calculator
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-27 обнГ9:12:42
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public enum Calculator {

	ADD("+") {
		public int exec(int a, int b) {
			return a + b;
		}
	},
	SUB("-") {
		public int exec(int a, int b) {
			return a - b;
		}
	};
	private String	value;

	private Calculator(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public abstract int exec(int a, int b);
}
