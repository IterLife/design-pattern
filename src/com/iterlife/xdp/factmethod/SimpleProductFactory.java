package com.iterlife.xdp.factmethod;


/**
 * @Description:com.iterlife.xdp.factmethod.SimpleProductFactory
 * 简单工厂模式 ,也叫静态工厂模式
 * @author:Lu Jie
 * @date:2015-7-19 下午3:11:42
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class SimpleProductFactory {
	@SuppressWarnings("unchecked")
	public static <T extends Product> T createProduct(Class<T> clazz) {
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
