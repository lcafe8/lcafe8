package com.lcafe8.strategy1;

public class Environment
{
	private Strategy strategy;

	public Environment(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public void Sort(int a,int b)
	{
		this.strategy.Caculate(a, b);
	}
}
