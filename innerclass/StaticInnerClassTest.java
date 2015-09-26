package com.lcafe8.innerclass;

public class StaticInnerClassTest
{
	public static void main(String[] args)
	{
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.test();
	}
}

class StaticInner
{
	private static int a = 4;

	// ¾²Ì¬ÄÚ²¿Àà
	public static class Inner
	{
		public void test()
		{
			System.out.println(a);
		}
	}
}