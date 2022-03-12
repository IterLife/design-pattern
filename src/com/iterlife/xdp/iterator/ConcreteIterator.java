package com.iterlife.xdp.iterator;


import java.util.Vector;

/**
 * @Description:com.iterlife.xdp.iterator.ConcreteIterator
 *
 * @author:Lu Jie
 * @date:2015-8-2 上午9:17:30
 * @version:1.0.0
 * @param <E>
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteIterator<E> implements Iterator {
	private Vector<E>	vector	= new Vector<E>();
	public int			cursor	= 0;

	public ConcreteIterator(Vector<E> vector) {
		this.vector = vector;
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return this.vector.get(cursor++);
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		if (this.cursor < 0 || this.cursor == this.vector.size()) {
			return false;
		}
		return true;
	}

	@Override
	public boolean remove() {
		this.vector.remove(this.cursor--);
		return true;
	}

}
