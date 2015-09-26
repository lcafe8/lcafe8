package com.lcafe8.exam;

public class Client
{
	public static void main(String[] args) throws Exception
	{
		ApplicationRun aRun = new ApplicationRun();
		
		MyClass myClass = new MyClass();
		
		String className = myClass.getClass().getName();
		
		aRun.run(className);
	}
}
