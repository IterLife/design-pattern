package com.iterlife.designpattern.absfactory;


/**
 * @Description:com.iterlife.designpattern.absfactory.AbstractFactory
 * ���󹤳�����:Ϊ����һ����ػ��໥�����Ķ����ṩһ���ӿڣ���������ָ�����ǵľ�����
 * 
 * �ŵ�:��װ�ԣ������Ĳ�Ʒ���ʵ�֣�ֻ��Ҫָ����Ӧ�Ĺ��������ܴ������Ҫ�Ķ���
 * ȱ��:��Ʒ����չ����
 * 
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 ����7:21:41
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class AbstractFactory {

	public abstract AbstractProductA creatorProductA();

	public abstract AbstractProductB creatorProductB();
}
