package com.lcafe0907;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateClient
{
	public static void main(String[] args) throws Exception
	{
		PrivateTest1 pTest1 = new PrivateTest1();
		Class<?> class1 = pTest1.getClass();
//		Method[] method2 = class1.getDeclaredMethods();
//		for (Method m : method2)
//		{
//			System.out.println(m);
//		}
		//操作private方法
		Method method = class1.getDeclaredMethod("sayHello", new Class[] { String.class });
		method.setAccessible(true);//压制java访问控制符检查
		Object object = method.invoke(pTest1, new Object[] { "Jack" });
		System.out.println((String) object);
		System.out.println("-------------------------");
		
		//操作private属性
		Field field = class1.getDeclaredField("name");
		field.setAccessible(true);
		field.set(pTest1, "lisi");
		Method method2 = class1.getDeclaredMethod("getName", new Class[]{});
		Object object2 = method2.invoke(pTest1, new Object[]{});
		System.out.println((String)object2);

	}
}
