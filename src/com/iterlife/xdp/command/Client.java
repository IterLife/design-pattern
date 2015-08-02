package com.iterlife.xdp.command;


/**
 * @Description:com.iterlife.xdp.command.Client
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����6:37:27
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();// ����ӿ���
		Receiver receiverA = new ConcreteAReceiver();// ���������A
		Receiver receiverB = new ConcreteBReceiver();// ���������B
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
