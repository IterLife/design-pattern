package com.iterlife.xdp.respchain;


/**
 * @Description:com.iterlife.xdp.respchain.HandlerLevelEnum
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-8-2 ����10:33:19
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public enum HandlerLevelEnum {

	// �漰˼·:���ϼ��ύ�����ƶȣ�����Խ�ߣ�����Ȩ��Խ��
	ZERO(0, "�㼶������"), ONE(1, "һ��������"), TWO(2, "����������"), THREE(3, "����������"), FOUR(4, "�ļ�������"), FIVE(5, "�弶������");
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
