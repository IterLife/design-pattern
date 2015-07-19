package com.iterlife.designpattern.factorymethod;


/**
 * @Description:com.iterlife.designpattern.factorymethod.AbstarctProductFactory.java
 * 工厂方法模式:定义一个用于创建对象的接口，让子类决定实例化哪一个类。
 * 工厂方法使一个类的实例化延迟到其子类
 * 优点:封装良好，代码结构清晰
 * 扩展性好，屏蔽产品类，解耦框架
 * 缺点:
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 下午2:48:59
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class AbstarctProductFactory {

	public abstract <T extends Product> T createProduct(Class<T> clazz);
}
