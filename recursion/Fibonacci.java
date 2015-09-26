package com.lcafe8.recursion;

public class Fibonacci
{
	public int func(int number)
	{
		if (1 == number || 2 == number)
		{
			return 1;
		}
		else
		{
			return func(number - 2) + func(number - 1);
		}
	}

	public static void main(String[] args)
	{
		Fibonacci fibonacci = new Fibonacci();

		for (int i = 1; i < 10; i++)
		{
			System.out.print(fibonacci.func(i) + " ");
		}
	}
}
