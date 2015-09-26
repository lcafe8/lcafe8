package com.lcafe8.decorator;

public class Client
{
	public static void main(String[] args)
	{
		//相当于节点流
		Component component1 = new ConcreteComponent();
		
		//相当于过滤流
		Component component2 = new ConcreteDecorator1(component1);
		
		component2.doSomething();
		System.out.println("----------------------------");
		
		//相当于过滤流
		Component component3 = new ConcreteDecorator2(component2);
		
		component3.doSomething();
	}
}
