package com.iterlife.xdp.builder;


/**
 * @Description:com.iterlife.xdp.builder.Director
 * 建造者模式:将一个复杂对象的构建和他的表示分离，使得同样的构建过程可以创建不同的表示
 * 优点:封装性，建造者独立，容易扩展，便于控制细节风险
 * @author:Lu Jie
 * @date:2015-7-25 上午10:58:20
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Director {
	private Builder	builderA	= new ConcreteAProduct();
	private Builder	builderB	= new ConcreteBProduct();

	public Product getProductA() {
		builderA.setPart();
		return builderA.buildProduct();
	}

	public Product getProductB() {
		builderB.setPart();
		return builderB.buildProduct();
	}
}
