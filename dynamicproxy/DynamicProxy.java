package com.lcafe8.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类的内部属性是Object，实际使用的时候通过构造方法传递进来一个参数。
 * 此外该类还实现了invoke 方法，该方法中method.invoke方法其实是调用被代理
 * 对象的将要执行的方法，方法参数sub，表示该方法从属于sub，通过动态代理类
 * 我们可以在执行真实的对象方法前后加入自己的方法。
 * @author Administrator
 * @date 2015年9月8日
 */
public class DynamicProxy implements InvocationHandler
{
	private Object sub; 
	
	public DynamicProxy(Object obj)
	{
		this.sub = obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		System.out.println("Before Calling: " + method);
		method.invoke(sub, args);
		System.out.println("After Calling: " + method);
		return null;
	}

}
