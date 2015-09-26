package com.lcafe8.exam;

public class MyClass
{
	public void method1()
	{
		System.out.println("method1()");
	}
	
	@Test
	public void method2()
	{
		System.out.println("method2()");
	}
	
	@Test
	public int add(int a,int b)
	{
		return a + b;
	}
	
	@Test
	public void doSomething(String str)
	{
		System.out.println(str);
	}
	
	@Test
	public void doSomething2()
	{
		System.out.println("doSomething2()");
	}
}
