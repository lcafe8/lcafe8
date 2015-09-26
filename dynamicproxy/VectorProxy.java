package com.lcafe8.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

public class VectorProxy implements InvocationHandler
{
	private Object proxyObj;

	public VectorProxy(Object obj)
	{
		this.proxyObj = obj;
	}
	
	public static Object factory(Object obj)
	{
		Class<?> classType = obj.getClass();
		Object object = Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces()
				,new VectorProxy(obj));
		return object;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		System.out.println("Before calling: " + method);
		if(null != args)
		{
			for(Object a: args)
			{
				System.out.println(a);
			}
		}
		Object object = method.invoke(proxyObj, args);
		System.out.println("After calling: " + method);
		
		return object;
	}
	
	public static void main(String[] args)
	{
		List list =(List) factory(new Vector());
		list.add("New");
		list.add("World");
		
		System.out.println(list);
	}
}
