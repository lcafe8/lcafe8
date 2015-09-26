package com.lcafe8.innerclass;

public class MemberInnerClass
{
	public static void main(String[] args)
	{
		MemberInner.Inner2 inner2 = new MemberInner().new Inner2();
		inner2.dosomething();
	}
}

class MemberInner
{
	private int a = 4;
	
	public class Inner2
	{
		private int a = 5;
		public void dosomething()
		{
			System.out.println(MemberInner.this.a);
		}
	}
	
	public void method()
	{
		this.new Inner2();
	}
}