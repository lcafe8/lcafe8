package com.lcafe8.innerclass;

public class LocalInnerClass
{
	public static void main(String[] args)
	{
		LoacalInner inner = new LoacalInner();
		inner.dosomething();
	}

}

class LoacalInner
{
	private int b = 5;
	public void dosomething()
	{
		final int a = 4;
		class inner3
		{
			public void test()
			{
				System.out.println("hello world");
				System.out.println(a);
			}
		}

		new inner3().test();
	}
}