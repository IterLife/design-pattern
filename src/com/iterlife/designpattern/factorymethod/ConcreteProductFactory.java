package com.iterlife.designpattern.factorymethod;


/**
 * @Description:com.iterlife.designpattern.factorymethod.ConcreteProductFactory.java
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 ÏÂÎç2:58:02
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteProductFactory extends AbstarctProductFactory {
	public ConcreteProductFactory() {
		System.out.println("initiative ConcreteProductFactory¡­¡­");
	}

	@SuppressWarnings("unchecked")
	public <T extends Product> T createProduct(Class<T> clazz) {
		Product product = null;
		try {
			product = (Product) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			System.out.println("ConcreteProductFactory.createProduct():InstantiationException");
		} catch (IllegalAccessException e) {
			System.out.println("ConcreteProductFactory.createProduct():IllegalAccessException");
		} catch (ClassNotFoundException e) {
			System.out.println("ConcreteProductFactory.createProduct():ClassNotFoundException");
		}
		return (T) product;
	}

}
