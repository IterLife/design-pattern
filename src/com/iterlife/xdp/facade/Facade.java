package com.iterlife.xdp.facade;


/**
 * @Description:com.iterlife.xdp.facade.Facade
 * 门面模式:要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行，门面模式提供一个高层次的接口，使得子系统更易于使用
 * 减少系统的相互依赖
 * 提高灵活性
 * 提高安全性
 * 
 * 门面对象只是提供访问子系统的接口，而不应该包含业务逻辑
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 下午4:29:43
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Facade {
	SystemA	systemA	= new SystemA();
	SystemB	systemB	= new SystemB();
	SystemC	systemC	= new SystemC();

	public void doSomethingA() {
		systemA.doSomething();
	}

	public void doSomethingB() {
		systemB.doSomething();
	}

	public void doSomethingC() {
		systemC.doSomething();
	}
}
