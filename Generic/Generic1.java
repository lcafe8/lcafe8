package com.lcafe0831;

public class Generic1<T>
{
	private T[] fooArray;

	public T[] getFooArray()
	{
		return fooArray;
	}

	public void setFooArray(T[] fooArray)
	{
		this.fooArray = fooArray;
	}
	
	public static void main(String[] args)
	{
		Generic1<String> foo = new Generic1<String>();
		
		String[] str1 = {"hello","world","welcome"};
		String[] str2 = null;
		
		foo.setFooArray(str1);
		str2 = foo.getFooArray();
		
		for(int i = 0;i < str2.length;i++)
		{
			System.out.println(str2[i]);
		}
		
	}
}
