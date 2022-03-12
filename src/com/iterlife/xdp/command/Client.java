package com.iterlife.xdp.command;


/**
 * @Description:com.iterlife.xdp.command.Client
 *
 * @author:Lu Jie
 * @date:2015-7-25 下午6:37:27
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();// 定义接口人
		Receiver receiverA = new ConcreteAReceiver();// 定义接收者A
		Receiver receiverB = new ConcreteBReceiver();// 定义接收者B
		invoker.setCommand(new ConcreteACommand(receiverA));
		invoker.action();
		invoker.setCommand(new ConcreteACommand(receiverB));
		invoker.action();
		invoker.setCommand(new ConcreteBCommand(receiverA));
		invoker.action();
		invoker.setCommand(new ConcreteBCommand(receiverB));
		invoker.action();
	}
}
