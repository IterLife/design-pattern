package com.iterlife.designpattern.absfactory;


public class Product2Factory extends absfactory {

	public AbstractProductA creatorProductA() {
		return new ProductA2();
	}

	public AbstractProductB creatorProductB() {
		return new ProductB2();
	}

}
