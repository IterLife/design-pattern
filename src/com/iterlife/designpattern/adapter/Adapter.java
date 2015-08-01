package com.iterlife.designpattern.adapter;


/**
 * @Description:com.iterlife.designpattern.adapter.Adapter
 * ������ģʽ:��һ����Ľӿڱ任�ɿͻ������ڴ�����һ���ӿڣ��Ӷ�ʹԭ����ӿڲ�ƥ����޷���һ�������������ܹ���һ������
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-1 ����9:56:06
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */

// ��������ɫ
public class Adapter extends Adaptee implements Target {

	public void request() {
		super.doSomething();
	}

}
