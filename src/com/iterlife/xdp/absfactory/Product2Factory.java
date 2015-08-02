package com.iterlife.xdp.absfactory;


public class Product2Factory extends AbstractFactory {

	public AbstractProductA creatorProductA() {
		return new ProductA2();
	}

	public AbstractProductB creatorProductB() {
		return new ProductB2();
	}

}
