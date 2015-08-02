package com.iterlife.xdp.iterator;


import java.util.Vector;

/**
 * @Description:com.iterlife.xdp.iterator.ConcreteAggregate
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ионГ9:27:25
 * @version:1.0.0
 * @param <E>
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteAggregate<E> implements Aggregate {

	private Vector<E>	vector	= new Vector<E>();

	@SuppressWarnings("unchecked")
	@Override
	public void add(Object obj) {
		this.vector.add((E) obj);

	}

	@Override
	public void remove(Object obj) {
		this.vector.remove(obj);

	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator<E>(vector);
	}
}
