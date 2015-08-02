package com.iterlife.xdp.prototype;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description:com.iterlife.xdp.prototype.NProtoType
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ÏÂÎç5:51:16
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class NProtoType implements Cloneable {

	private ArrayList<String>	names	= new ArrayList<String>();

	public NProtoType(String name) {
		names.add(name);
	}

	@SuppressWarnings("unchecked")
	public NProtoType clone() {
		NProtoType nProtoType = null;
		try {
			nProtoType = (NProtoType) super.clone();
			this.names = (ArrayList<String>) this.names.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return nProtoType;
	}

	public void setNames(String name) {
		this.names.add(name);
	}

	public List<String> getNames() {
		return this.names;
	}
}
