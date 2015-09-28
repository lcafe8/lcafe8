package com.lcafe8.refection;

public class PrivateTest1
{
	private String name = "zhangsan";
	
	private String sayHello(String name1)
	{
		return "hello: " + name1;
	}

	public String getName()
	{
		return name;
	}
}
