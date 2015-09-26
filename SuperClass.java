package com.lcafe8;

public class SuperClass
{
	public SuperClass()
	{
		System.out.println("No Assignment Constructor");
	}
	
	private void test()
	{
		System.out.println("private");
	}
	
	public final void test1()
	{
		System.out.println("final");
	}
}
