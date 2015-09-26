package com.lcafe8;

public class ChildClass extends SuperClass implements Cloneable
{
	public ChildClass()
	{
		super();
		//super("super");
	}
	
	public void test()
	{
		System.out.println(super.getClass().getName());
	}
	
	public void cloned() throws CloneNotSupportedException
	{
		ChildClass s1 = (ChildClass) super.clone();
		s1.test1();
	}
	
	public static void main(String[] args)
	{
		ChildClass s = new ChildClass();
		s.test1();
		s.test();
	}
}
