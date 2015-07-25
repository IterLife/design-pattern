package com.iterlife.designpattern.builder;


/**
 * @Description:com.iterlife.designpattern.builder.Director
 * ������ģʽ:��һ�����Ӷ���Ĺ��������ı�ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ
 * �ŵ�:��װ�ԣ������߶�����������չ�����ڿ���ϸ�ڷ���
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����10:58:20
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Director {
	private Builder	builderA	= new ConcreteAProduct();
	private Builder	builderB	= new ConcreteBProduct();

	public Product getProductA() {
		builderA.setPart();
		return builderA.buildProduct();
	}

	public Product getProductB() {
		builderB.setPart();
		return builderB.buildProduct();
	}
}
