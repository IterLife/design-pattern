package com.iterlife.xdp.command;


/**
 * @Description:com.iterlife.xdp.command.Command
 * 命令模式:将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 * 类间解耦:调用者和接收者之间没有任何解耦关系。
 * 可扩展性：Command极易扩展，但也会导致类的个数膨胀
 * 
 * 
 * @author:Lu Jie
 * @date:2015-8-2 下午3:47:11
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class Command {
	protected Receiver	receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	public abstract void execute();
}
