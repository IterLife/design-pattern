package com.iterlife.designpattern.builder;


/**
 * @Description:com.iterlife.designpattern.builder.ConcreteBProduct
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ионГ11:08:34
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteBProduct extends Builder {

	Product	product	= new Product();

	public void setPart() {
		this.product.setProductName("ConcreteB");
	}

	/*
	 * (non-Javadoc)
	 * @see com.iterlife.designpattern.builder.Builder#buildProduct()
	 */
	@Override
	public Product buildProduct() {
		return this.product;
	}

}
