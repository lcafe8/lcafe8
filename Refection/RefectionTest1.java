package com.lcafe8.refection;

import java.lang.reflect.Method;

public class RefectionTest1
{
	public static void main(String[] args) throws Exception
	{
		Class<?> classtype = Class.forName("java.lang.String");
		Method[] methods =  classtype.getDeclaredMethods();
		for(Method element:methods)
		{
			System.out.println(element);
		}
	}
}
