package com.lcafe8.annotation;

public class OverrideTest
{
	//������д���෽��
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
