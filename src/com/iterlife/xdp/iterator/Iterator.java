package com.iterlife.xdp.iterator;


/**
 * @Description:com.iterlife.xdp.iterator.Iterator
 * ������ģʽ:�ṩһ�ַ�������һ����������ĸ���Ԫ�أ�������Ҫ��©�ö�����ڲ�ʵ��ϸ��
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ����9:14:44
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */

// ���������
public interface Iterator {

	/**
	 *��ȡ��һ������ 
	 **/
	public Object next();

	/**
	 *�Ƿ������һ������ 
	 **/
	public boolean hasNext();

	/**
	 *�Ƴ�һ������ 
	 **/
	public boolean remove();
}
