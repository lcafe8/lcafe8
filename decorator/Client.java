package com.lcafe8.decorator;

public class Client
{
	public static void main(String[] args)
	{
		//�൱�ڽڵ���
		Component component1 = new ConcreteComponent();
		
		//�൱�ڹ�����
		Component component2 = new ConcreteDecorator1(component1);
		
		component2.doSomething();
		System.out.println("----------------------------");
		
		//�൱�ڹ�����
		Component component3 = new ConcreteDecorator2(component2);
		
		component3.doSomething();
	}
}
