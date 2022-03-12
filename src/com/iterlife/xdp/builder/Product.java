package com.iterlife.xdp.builder;


/**
 * @Description:com.iterlife.xdp.builder.Product
 *
 * @author:Lu Jie
 * @date:2015-7-25 上午10:53:53
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Product {
	private String	productName;

	public void doSomething() {
		System.out.println("[" + this.productName + "]:Product.doSomething()");
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
}
