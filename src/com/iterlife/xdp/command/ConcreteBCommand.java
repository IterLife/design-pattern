package com.iterlife.xdp.command;


/**
 * @Description:com.iterlife.xdp.command.ConcreteBCommand
 *
 * @author:Lu Jie
 * @date:2015-8-2 обнГ3:50:08
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteBCommand extends Command {

	public ConcreteBCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		super.receiver.doSomething();
	}

}
