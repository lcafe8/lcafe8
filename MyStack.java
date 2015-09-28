package com.lcafe8;

import java.util.LinkedList;

public class MyStack
{
	private LinkedList<String> list = new LinkedList<String>();
	
	public void Push(String e)
	{
		list.addFirst(e);
	}
	
	public Object Pop()
	{
		return list.removeFirst();
	}
	
	public Object Peek()
	{
		return list.getFirst();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public static void main(String[] args)
	{
		MyStack s = new MyStack();
		
		s.Push("one");
		s.Push("two");
		
		System.out.println(s.Peek());
		System.out.println(s.Pop());
		
		s.Push("three");
		System.out.println(s.Peek());
		System.out.println(s.Pop());
		
		System.out.println(s.Peek());
		System.out.println(s.Pop());
		
		System.out.println(s.isEmpty());
		
	}
}
