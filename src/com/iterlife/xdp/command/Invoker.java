package com.iterlife.xdp.command;


/**
 * @Description:com.iterlife.xdp.command.Invoker
 *
 * @author:Lu Jie
 * @date:2015-8-2 下午3:51:45
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Invoker {
	private Command	command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void action() {
		command.execute();// 执行命令
	}
}
