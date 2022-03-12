package com.iterlife.xdp.decorator;


/**
 * @Description:com.iterlife.xdp.decorator.Decorator
 * 装饰模式:动态的给一个对象添加额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活
 * 装饰类(ConcreteDecoratorX)和被装饰类(ConcreteComponent)可以独立发展，而不相互耦合
 * Componet无须知道Decorator的存在，Decorator也不知道具体的构建，因为是外部注入的
 * 装饰模式是类继承关系的一个替代方案
 * 装饰模式可以动态扩展一个实现类的功能
 * 缺点是多层装饰
 * 
 * @author:Lu Jie
 * @date:2015-7-27 下午9:58:29
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class Decorator extends Component {

	private Component	component	= null;

	public Decorator(Component component) {
		this.component = component;
	}

	public void operate() {
		this.component.operate();
	}
}
