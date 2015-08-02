package com.iterlife.xdp.command;


/**
 * @Description:com.iterlife.xdp.command.Command
 * ����ģʽ:��һ�������װ��һ�����󣬴Ӷ�����ʹ�ò�ͬ������ѿͻ��˲��������������Ŷӻ��߼�¼������־�������ṩ����ĳ����ͻָ����ܡ�
 * ������:�����ߺͽ�����֮��û���κν����ϵ��
 * ����չ�ԣ�Command������չ����Ҳ�ᵼ����ĸ�������
 * 
 * 
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ����3:47:11
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
