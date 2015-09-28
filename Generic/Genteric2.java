package com.lcafe8.generic;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Genteric2<T>
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
		Genteric2<? extends List> ge = null;
		
		ge = new Genteric2<LinkedList>();
		ge = new Genteric2<ArrayList>();
		
	}
}
