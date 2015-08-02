package com.iterlife.xdp.adapter;


/**
 * @Description:com.iterlife.xdp.adapter.Client
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 обнГ6:37:02
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	public static void main(String[] args) {
		Target target = new ConcreteTarget();
		target.request();
		Target nTarget = new Adapter();
		nTarget.request();
	}
}
