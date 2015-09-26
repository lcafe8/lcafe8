package com.lcafe8.innerclass;

import java.sql.Date;

public class AnonymousInnerClass
{
	@SuppressWarnings("deprecation")
	public String get(Date date)
	{
		return date.toLocaleString();
	}
	
	public static void main(String[] args)
	{
		AnonymousInnerClass test = new AnonymousInnerClass();
		
		System.out.println(test.get(new Date(1000)));
		
		//匿名内部类，继承了Date类
		String str = test.get(new Date(1000)
		{
			@Override
			public String toLocaleString()
			{
				return "Hello World";
			}
		});
		
		System.out.println(str);
	}
}
