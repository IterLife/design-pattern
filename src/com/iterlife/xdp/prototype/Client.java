package com.iterlife.xdp.prototype;


/**
 * @Description:com.iterlife.xdp.prototype.Client
 * 原型模型:用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 性能优良:内存二进制流拷贝
 * 逃避构造函数的约束:直接内存拷贝，不执行构造函数
 * @author:Lu Jie
 * @date:2015-7-25 下午5:12:17
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	public static void main(String[] args) {
		// 浅拷贝
		SProtoType sProtoType1 = new SProtoType("sProtoType1");
		System.out.println("[sProtoType1]:" + sProtoType1.getNames());
		SProtoType sProtoType2 = sProtoType1.clone();
		sProtoType1.setNames("sProtoType2");
		System.out.println("[sProtoType1]:" + sProtoType1.getNames());
		System.out.println("[sProtoType2]:" + sProtoType2.getNames());

		// 深拷贝
		NProtoType nProtoType1 = new NProtoType("nProtoType1");
		System.out.println("[nProtoType1]:" + nProtoType1.getNames());
		NProtoType nProtoType2 = nProtoType1.clone();
		nProtoType2.setNames("nProtoType2");
		System.out.println("[nProtoType1]:" + nProtoType1.getNames());
		System.out.println("[nProtoType2]:" + nProtoType2.getNames());
	}
}
