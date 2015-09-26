package com.lcafe8;

import java.util.LinkedList;

public class MyQueue
{
	private LinkedList list = new LinkedList();
	
	public void put(Object o)
	{
		list.addLast(o);
	}
	
	public Object get()
	{
		return list.removeFirst();
	}

	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public static void main(String[] args)
	{
		MyQueue q = new MyQueue();
		
		q.put("queue1");
		q.put("queue2");
		q.put("queue3");
		
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());
		
		System.out.println(q.isEmpty());
	}
}
