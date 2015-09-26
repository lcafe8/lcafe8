package com.lcafe8.exam;

import java.lang.reflect.Method;

public class ApplicationRun
{
	public void run(String className) throws Exception
	{
		Class<?> class1 = Class.forName(className);
		Object myClass = class1.newInstance();

		Method[] methods = class1.getMethods();// ��ȡ���е����з���(����)

		for (Method method : methods)
		{
			if (method.isAnnotationPresent(Test.class)) // �жϷ����Ƿ�@Test����
			{
				Class<?>[] paramCount = method.getParameterTypes();// ��ȡ��������
				if (0 == paramCount.length) // �жϲ��������Ƿ�Ϊ0
				{
					//System.out.println(method.getName());
					Object object = method.invoke(myClass, new Object[] {});
				}
			}
		}
	}
}
