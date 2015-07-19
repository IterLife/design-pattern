package com.iterlife.designpattern.abstractfactory;


public class Product2Factory extends AbstractFactory {

	public AbstractProductA creatorProductA() {
		return new ProductA2();
	}

	public AbstractProductB creatorProductB() {
		return new ProductB2();
	}

}
