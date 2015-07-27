package com.iterlife.designpattern.decorator;


/**
 * @Description:com.iterlife.designpattern.decorator.Decorator
 * װ��ģʽ:��̬�ĸ�һ��������Ӷ����ְ�𡣾����ӹ�����˵��װ��ģʽ������������Ϊ���
 * װ����(ConcreteDecoratorX)�ͱ�װ����(ConcreteComponent)���Զ�����չ�������໥���
 * Componet����֪��Decorator�Ĵ��ڣ�DecoratorҲ��֪������Ĺ�������Ϊ���ⲿע���
 * װ��ģʽ����̳й�ϵ��һ���������
 * װ��ģʽ���Զ�̬��չһ��ʵ����Ĺ���
 * ȱ���Ƕ��װ��
 * 
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-27 ����9:58:29
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public abstract class Decorator extends Component {

	private Component	component	= null;

	public Decorator(Component component) {
		this.component = component;
	}

	public void operate() {
		this.component.operate();
	}
}
