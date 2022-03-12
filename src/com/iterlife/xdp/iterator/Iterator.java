package com.iterlife.xdp.iterator;


/**
 * @Description:com.iterlife.xdp.iterator.Iterator
 * 迭代器模式:提供一种方法访问一个容器对象的各个元素，而不需要暴漏该对象的内部实现细节
 * @author:Lu Jie
 * @date:2015-8-2 上午9:14:44
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */

// 抽象迭代器
public interface Iterator {

	/**
	 *获取下一个对象 
	 **/
	public Object next();

	/**
	 *是否存在下一个对象 
	 **/
	public boolean hasNext();

	/**
	 *移除一个对象 
	 **/
	public boolean remove();
}
