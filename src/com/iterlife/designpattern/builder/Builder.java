package com.iterlife.designpattern.builder;


/**
 * @Description:com.iterlife.designpattern.builder.Builder.java
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ÉÏÎç10:54:54
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class Builder {

	public abstract void setPart();

	public abstract Product buildProduct();
}
