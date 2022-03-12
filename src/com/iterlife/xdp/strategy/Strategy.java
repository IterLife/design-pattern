package com.iterlife.xdp.strategy;

/**
 * @Description:com.iterlife.xdp.strategy.Strategy
 * 策略模式:定义一组算法，将每个算法都封装起来，并且使他们之间可以互相替换
 * 算法可以自由切换，避免使用多重条件判断，扩展性良好
 * 策略类数量增多，所有的策略类都需要向外暴漏
 * @author:Lu Jie
 * @date:2015-7-27 下午8:37:20
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public interface Strategy {

	public void doSomething();
}
