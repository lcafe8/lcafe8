package com.lcafe8.generic;

public class GenericFoo<T>
{
	private T foo;

	public T getFoo()
	{
		return foo;
	}

	public void setFoo(T foo)
	{
		this.foo = foo;
	}
	
	public static void main(String[] args)
	{
		GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
		GenericFoo<Integer> foo2 = new GenericFoo<Integer>();
		
		foo1.setFoo(new Boolean(true));
		foo2.setFoo(new Integer(10));
		
		Boolean b = foo1.getFoo();
		Integer i = foo2.getFoo();
		
		System.out.println(b);
		System.out.println(i);
 	}
}
