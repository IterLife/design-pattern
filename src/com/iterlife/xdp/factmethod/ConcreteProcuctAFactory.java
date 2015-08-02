package com.iterlife.xdp.factmethod;


public class ConcreteProcuctAFactory extends AbstarctProductFactory {

	public <T extends Product> T createProduct(Class<T> clazz) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T extends Product> T createProduct() {
		return (T) new ConcreteProcuctA();
	}
}
