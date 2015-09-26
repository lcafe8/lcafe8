package com.lcafe8.exception;

public class ExceptionTest
{
	public static void main(String[] args)
	{
		int c = 0;

		try
		{
			int a = 4;
			int b = 0;
			c = a / b;
		} 
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Hello World!");
		}

		System.out.println(c);
	}
}
