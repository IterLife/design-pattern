package com.iterlife.xdp.prototype;


/**
 * @Description:com.iterlife.xdp.prototype.Client
 * ԭ��ģ��:��ԭ��ʵ��ָ��������������࣬����ͨ��������Щԭ�ʹ����µĶ���
 * ��������:�ڴ������������
 * �ӱܹ��캯����Լ��:ֱ���ڴ濽������ִ�й��캯��
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-25 ����5:12:17
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	public static void main(String[] args) {
		// ǳ����
		SProtoType sProtoType1 = new SProtoType("sProtoType1");
		System.out.println("[sProtoType1]:" + sProtoType1.getNames());
		SProtoType sProtoType2 = sProtoType1.clone();
		sProtoType1.setNames("sProtoType2");
		System.out.println("[sProtoType1]:" + sProtoType1.getNames());
		System.out.println("[sProtoType2]:" + sProtoType2.getNames());

		// ���
		NProtoType nProtoType1 = new NProtoType("nProtoType1");
		System.out.println("[nProtoType1]:" + nProtoType1.getNames());
		NProtoType nProtoType2 = nProtoType1.clone();
		nProtoType2.setNames("nProtoType2");
		System.out.println("[nProtoType1]:" + nProtoType1.getNames());
		System.out.println("[nProtoType2]:" + nProtoType2.getNames());
	}
}
