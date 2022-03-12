package com.iterlife.xdp.factmethod;


/**
 * @Description:com.iterlife.xdp.factmethod.ConcreteProcuctBFactory
 * @author:Lu Jie
 * @date:2015-7-19 下午3:20:55
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
