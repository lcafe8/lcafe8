package com.lcafe8.annotation;

public class OverrideTest
{
	//子类重写父类方法
	@Override
	public String toString()
	{
		return "This is OverrideTest";
	}
	
	public static void main(String[] args)
	{
		System.out.println(new OverrideTest());
	}
}
