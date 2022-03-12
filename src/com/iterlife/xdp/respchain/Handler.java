package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.Handler
 * 责任链模式:使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系，将接收者连成一个链，并沿着该链传送该请求，直到有对象处理它位置
 * 将请求和处理分开，类似递归导致性能问题和调试不便
 * 
 * @author:Lu Jie
 * @date:2015-8-2 上午10:30:39
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */

// 抽象处理者
public abstract class Handler {

	private Handler	nextHandler;	// 定义下一个处理器

	public abstract HandlerLevelEnum getHandLevelEnum();// 定义能处理交易处理的最小级别

	public abstract Response handler(Request request);// 定义处理方法

	public static Response[]	response	= new Response[] { new YesResponse(), new NoResponse() };

	/**
	 * @param nextHandler the nextHandler to set
	 */
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public final Response handlerRequest(Request request) {
		return this.handler(request);
	}

	/**
	 * @return the nextHandler
	 */
	public Handler getNextHandler() {
		return nextHandler;
	}

}
