package com.lcafe8.annotation;

public class DeprecatedTest
{
	//�����鱻ʹ��
	@Deprecated
	public String doSomething()
	{
		return "To do Something";
	}
	
	public static void main(String[] args)
	{
		DeprecatedTest dTest = new DeprecatedTest();
		System.out.println(dTest.doSomething());
	}
}
