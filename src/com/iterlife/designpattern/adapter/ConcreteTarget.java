package com.iterlife.designpattern.adapter;


/**
 * @Description:com.iterlife.designpattern.adapter.ConcreteTarget
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-1 下午9:52:39
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */

// 目标角色实现类
public class ConcreteTarget implements Target {
	@Override
	public void request() {
		System.out.println("If you need any help,plz call me!");
	}

}
