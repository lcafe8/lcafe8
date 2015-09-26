package com.lcafe8.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyRefection
{
	public static void main(String[] args) throws Exception
	{
		MyTest myTest = new MyTest();

		Class<?> class1 = myTest.getClass();

		Method method = class1.getDeclaredMethod("output", new Class[] {});

		if (method.isAnnotationPresent(MyAnnotation.class))
		{
			method.invoke(myTest, new Object[] {});
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			String hello = myAnnotation.Hello();
			String world = myAnnotation.World();
			System.out.println("Hello: " + hello + ",World: " + world);
		}
		
		Annotation[] annotation = method.getAnnotations();
		
		for(Annotation a: annotation)
		{
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
