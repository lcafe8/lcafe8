package com.lcafe8.annotation;

@MyAnnotation(Hello="Beijing",World="Tianjin")
public class MyTest
{
	@MyAnnotation(Hello="Tianjin",World="Shanghai")//RUNTIME
	@Deprecated//RUNTIME
	@SuppressWarnings("unchecked")//����RUNTIME
	public void output()
	{
		System.out.println("ouput something!");
	}
}
