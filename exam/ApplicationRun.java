package com.lcafe8.exam;

import java.lang.reflect.Method;

public class ApplicationRun
{
	public void run(String className) throws Exception
	{
		Class<?> class1 = Class.forName(className);
		Object myClass = class1.newInstance();

		Method[] methods = class1.getMethods();// 获取类中的所有方法(数组)

		for (Method method : methods)
		{
			if (method.isAnnotationPresent(Test.class)) // 判断方法是否被@Test修饰
			{
				Class<?>[] paramCount = method.getParameterTypes();// 获取方法参数
				if (0 == paramCount.length) // 判断参数个数是否为0
				{
					//System.out.println(method.getName());
					Object object = method.invoke(myClass, new Object[] {});
				}
			}
		}
	}
}
