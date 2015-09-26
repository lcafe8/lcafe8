package com.lcafe8.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client
{
	public static void main(String[] args)
	{
		RealSubject realSubject = new RealSubject();

		InvocationHandler handler = new DynamicProxy(realSubject);

		Class<?> class1 = handler.getClass();

		// 一次性生成代理
		Subject subject = (Subject) Proxy.newProxyInstance(class1.getClassLoader()
				, realSubject.getClass().getInterfaces(), handler);
		//Subject subject = (Subject) Proxy.newProxyInstance(class1.getClassLoader(),
		//	new Class[]{com.lcafe8.dynamicproxy.Subject.class}, handler);
		//第二个参数是真实角色实现的接口，代理角色也必须实现。这样才能操作真实角色中的方法，
		//只是这里代理角色是动态实现。
		//静态代理中代理角色在声明中就已经实现。

		subject.request();
		
		System.out.println(subject.getClass());

	}

}
