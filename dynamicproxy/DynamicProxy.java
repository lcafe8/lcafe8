package com.lcafe8.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��������ڲ�������Object��ʵ��ʹ�õ�ʱ��ͨ�����췽�����ݽ���һ��������
 * ������໹ʵ����invoke �������÷�����method.invoke������ʵ�ǵ��ñ�����
 * ����Ľ�Ҫִ�еķ�������������sub����ʾ�÷���������sub��ͨ����̬������
 * ���ǿ�����ִ����ʵ�Ķ��󷽷�ǰ������Լ��ķ�����
 * @author Administrator
 * @date 2015��9��8��
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
