package com.lcafe8.refection;

import java.lang.reflect.Method;

import com.lcafe8.tests;

public class InvokeTest
{
	public int add(int param1, int param2)
	{
		return param1 + param2;
	}

	public String echo(String message)
	{
		return "hello: " + message;
	}

	public static void main(String[] args) throws Exception
	{
		//InvokeTest test = new InvokeTest();
		// System.out.println(test.add(2, 3));
		// System.out.println(test.echo("World!"));

		// Class<?> classtype = Class.forName("com.lcafe0907.InvokeTest");
		//Class<?> classtype1 = test.getClass();
		Class<?> classtype = InvokeTest.class;
		Object invoketest = classtype.newInstance();// 生成一个InvokeTest的对象
		Method method = classtype.getMethod("add", new Class[] { int.class, int.class });
		Object result = method.invoke(invoketest, new Object[] { 2, 3 });

		System.out.println(invoketest instanceof InvokeTest);
		System.out.println((Integer) result);
		System.out.println("-------------------------------");

		Method method2 = classtype.getMethod("echo", new Class[] { String.class });
		Object result2 = method2.invoke(invoketest, new Object[] { "Tom" });
		System.out.println((String) result2);
	}
}
