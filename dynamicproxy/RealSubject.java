package com.lcafe8.dynamicproxy;

public class RealSubject implements Subject
{
	public void request()
	{
		System.out.println("From Real-Request");
	}
}