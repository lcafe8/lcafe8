package com.lcafe8.recursion;

public class Recursive
{
	//ѭ�����㣬��������
	public int compute(int number)
	{
		int result = 1;
		for (int i = number; i > 0; --i)
		{
			result *= i;
		}
		return result;
	}
	
	//�ݹ����
	public int compute2(int number)
	{
		if(number == 1)
		{
			return 1;
		}
		else
		{
			return compute2(number-1)*number;
		}
	}

	public static void main(String[] args)
	{
		Recursive recursive = new Recursive();

		System.out.println(recursive.compute(5));
		
		System.out.println(recursive.compute2(5));
	}
}
