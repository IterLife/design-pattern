package com.iterlife.designpattern.factorymethod;


/**
 * @Description:com.iterlife.designpattern.factorymethod.ConcreteProcuctBFactory.java
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 обнГ3:20:55
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteProcuctBFactory extends AbstarctProductFactory {

	public <T extends Product> T createProduct(Class<T> clazz) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T extends Product> T createProduct() {
		return (T) new ConcreteProcuctB();
	}

}
