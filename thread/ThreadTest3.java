package com.lcafe8.thread;

public class ThreadTest3
{
	public static void main(String[] args)
	{
		Example example = new Example();

		Thread t1 = new TheThread(example);// 锁对象,不是锁方法。
		Thread t2 = new TheThread2(example);

		t1.start();
		t2.start();
	}
}

class Example
{
	public synchronized void execute()
	{
		for (int i = 0; i < 20; i++)
		{
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("example: " + i);
		}
	}

	public synchronized void execute2()
	{
		for (int i = 0; i < 20; i++)
		{
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("hello: " + i);
		}
	}

}

class TheThread extends Thread
{
	private Example example;

	public TheThread(Example example)
	{
		this.example = example;
	}

	@Override
	public void run()
	{
		this.example.execute();
	}
}

class TheThread2 extends Thread
{
	private Example example;

	public TheThread2(Example example)
	{
		this.example = example;
	}

	@Override
	public void run()
	{
		this.example.execute2();
	}
}