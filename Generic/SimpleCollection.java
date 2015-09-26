package com.lcafe0831;

public class SimpleCollection<T>
{
	private T[] objArr;
	
	private int index = 0;
	
	public SimpleCollection()
	{
		objArr = (T[])new Object[10]; 
		// TODO Auto-generated constructor stub
	}
	
	public SimpleCollection(int capacity)
	{
		objArr = (T[])new Object[capacity];
	}
	
	public void put(Object i)
	{
		objArr[index++] = (T) i;
	}
	
	public T get(int i)
	{
		return objArr[i];
	}
	
	public int length()
	{
		return this.index;
	}
	
	public static void main(String[] args)
	{
		SimpleCollection<Integer> coll = new SimpleCollection<Integer>(10);
		
		for(int i = 0; i<10;i++)
		{
			coll.put(new Integer(i));
		}
		for(int k = 0;k < coll.length();k++)
		{
			System.out.println(coll.get(k));
		}
	}
	
}
