package com.iterlife.xdp.builder;


/**
 * @Description:com.iterlife.xdp.builder.ConcreteAProduct
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ионГ10:56:34
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteAProduct extends Builder {
	Product	product	= new Product();

	/*
	 * (non-Javadoc)
	 * @see com.iterlife.xdp.builder.Builder#setPart()
	 */
	@Override
	public void setPart() {
		this.product.setProductName("ConcreteA");
	}

	public Product buildProduct() {
		return this.product;
	}
}
