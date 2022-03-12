package com.iterlife.xdp.iterator;


/**
 * @Description:com.iterlife.xdp.iterator.Client
 *
 * @author:Lu Jie
 * @date:2015-7-25 обнГ6:38:16
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	public static void main(String[] args) {

		Aggregate myCollection = new ConcreteAggregate<String>();
		myCollection.add("Lu Jie");
		myCollection.add("Xu Na");
		Iterator iterator = myCollection.iterator();
		while (iterator.hasNext()) {
			iterator.remove();
		}
	}

}
