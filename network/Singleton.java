package com.lcafe8.network;
/***
 * 在方法生成实例会产生多线程同步问题，即可能生成两个不同对象
 * @author Administrator
 * @date 2015年9月29日
 */
public class Singleton
{
	//private static Singleton singleton = new Singleton();
	private static Singleton singleton;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(null ==singleton)
		{
			try
			{
				Thread.sleep((long)(Math.random()*4000));
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			singleton = new Singleton();
		}
		return singleton;
	}
	public static void main(String[] args)
	{
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		
		t1.start();
		t2.start();
	}
}

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Singleton.getInstance());
	}
}
