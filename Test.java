package com.lcafe8;

public  class Test implements TestInterface
{
	@Override
	public int add(int a, int b)
	{
		return 0;
	}
	@Override
	public int subtract(int a, int b)
	{
		return 0;
	}
	
	public static boolean TeatReturn()
	{
		int x = 1;
		return x == 1;
	}
	
	public static void main(String[] args)
	{
		String username = "abx";
		
		if(username.equals("zzx"))
			System.out.println(true);
		else
			System.out.println(false);
		
		System.out.println(Test.TeatReturn());
	}
}
