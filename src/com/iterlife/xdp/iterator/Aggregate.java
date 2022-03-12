package com.iterlife.xdp.iterator;


/**
 * @Description:com.iterlife.xdp.iterator.Aggregate
 *
 * @author:Lu Jie
 * @date:2015-8-2 ����9:26:53
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
// ��������
public interface Aggregate {

	public void add(Object obj);

	public void remove(Object obj);

	public Iterator iterator();
}
