package com.iterlife.xdp.command;


/**
 * @Description:com.iterlife.xdp.command.ConcreteAReceiver
 *
 * @author:Lu Jie
 * @date:2015-8-2 下午3:46:17
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteAReceiver extends Receiver {

	@Override
	public void doSomething() {
		System.out.println("ConcreteAReceiver.doSomething()");
	}

}
