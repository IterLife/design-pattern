package com.iterlife.designpattern.absfactory;

/**
 * @Description:com.iterlife.designpattern.absfactory.Product1Factory
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 обнГ7:23:49
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Product1Factory extends absfactory {

	public AbstractProductA creatorProductA() {
		return new ProductA1();
	}

	public AbstractProductB creatorProductB() {
		return new ProductB1();
	}

}
