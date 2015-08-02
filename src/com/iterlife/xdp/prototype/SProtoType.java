package com.iterlife.xdp.prototype;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description:com.iterlife.xdp.prototype.SProtoType
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ÏÂÎç5:08:05
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class SProtoType implements Cloneable {

	private List<String>	names	= new ArrayList<String>();

	public SProtoType(String name) {
		names.add(name);
	}

	public SProtoType clone() {
		SProtoType protoType = null;
		try {
			protoType = (SProtoType) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return protoType;
	}

	public void setNames(String name) {
		this.names.add(name);
	}

	public List<String> getNames() {
		return this.names;
	}

}
