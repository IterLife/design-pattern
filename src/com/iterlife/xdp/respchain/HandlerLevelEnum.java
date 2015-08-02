package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.HandlerLevelEnum
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 上午10:33:19
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public enum HandlerLevelEnum {

	// 涉及思路:向上级提交审批制度，级别越高，处理权限越大
	ZERO(0, "零级处理级别"), ONE(1, "一级处理级别"), TWO(2, "二级处理级别"), THREE(3, "三级处理级别"), FOUR(4, "四级处理级别"), FIVE(5, "五级处理级别");
	private int		levelCode;
	private String	levelDesc;

	private HandlerLevelEnum(int levelCode, String levelDesc) {
		this.levelCode = levelCode;
		this.levelDesc = levelDesc;
	}

	public boolean canHandler(HandlerLevelEnum handLevelEnum) {
		return this.levelCode >= handLevelEnum.levelCode;
	}

	/**
	 * @return the levelCode
	 */
	public int getLevelCode() {
		return levelCode;
	}

	/**
	 * @param levelCode the levelCode to set
	 */
	public void setLevelCode(int levelCode) {
		this.levelCode = levelCode;
	}

	/**
	 * @return the levelDesc
	 */
	public String getLevelDesc() {
		return levelDesc;
	}

	/**
	 * @param levelDesc the levelDesc to set
	 */
	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}
}
