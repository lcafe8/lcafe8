package com.lcafe8.exception;

public class MyTest
{
	public void method(String str) throws MyException
	{
		if(null == str)
		{
			throw new MyException("�����ַ�����������Ϊnull");
		}
		else
		{
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) throws MyException
	{
		MyTest mTest = new MyTest();
		mTest.method("Hello World!");
	}
}
