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

		// һ�������ɴ���
		Subject subject = (Subject) Proxy.newProxyInstance(class1.getClassLoader()
				, realSubject.getClass().getInterfaces(), handler);
		//Subject subject = (Subject) Proxy.newProxyInstance(class1.getClassLoader(),
		//	new Class[]{com.lcafe8.dynamicproxy.Subject.class}, handler);
		//�ڶ�����������ʵ��ɫʵ�ֵĽӿڣ������ɫҲ����ʵ�֡��������ܲ�����ʵ��ɫ�еķ�����
		//ֻ����������ɫ�Ƕ�̬ʵ�֡�
		//��̬�����д����ɫ�������о��Ѿ�ʵ�֡�

		subject.request();
		
		System.out.println(subject.getClass());

	}

}
