package com.iterlife.designpattern.absfactory;


/**
 * @Description:com.iterlife.designpattern.absfactory.AbstractFactory
 * 抽象工厂方法:为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类
 * 
 * 优点:封装性，不关心产品类的实现，只需要指定相应的工厂，便能创造出需要的对象
 * 缺点:产品族扩展困难
 * 
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 下午7:21:41
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class AbstractFactory {

	public abstract AbstractProductA creatorProductA();

	public abstract AbstractProductB creatorProductB();
}
