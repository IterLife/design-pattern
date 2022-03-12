package com.iterlife.xdp.adapter;


/**
 * @Description:com.iterlife.xdp.adapter.Adapter
 * 适配器模式:将一个类的接口变换成客户端所期待的另一个接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 *
 * @author:Lu Jie
 * @date:2015-8-1 下午9:56:06
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */

// 适配器角色
public class Adapter extends Adaptee implements Target {

	public void request() {
		super.doSomething();
	}

}
