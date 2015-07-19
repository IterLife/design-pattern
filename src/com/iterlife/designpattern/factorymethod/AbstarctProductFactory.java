package com.iterlife.designpattern.factorymethod;


/**
 * @Description:com.iterlife.designpattern.factorymethod.AbstarctProductFactory.java
 * ��������ģʽ:����һ�����ڴ�������Ľӿڣ����������ʵ������һ���ࡣ
 * ��������ʹһ�����ʵ�����ӳٵ�������
 * �ŵ�:��װ���ã�����ṹ����
 * ��չ�Ժã����β�Ʒ�࣬������
 * ȱ��:
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 ����2:48:59
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class AbstarctProductFactory {

	public abstract <T extends Product> T createProduct(Class<T> clazz);
}
