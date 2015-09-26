package com.lcafe8.strategy;

import java.util.HashMap;

public class StrategyTest
{
	public static void main(String[] args)
	{
		Strategy strategy = new AddStrategy();
		Environment en = new Environment(strategy);
		System.out.println(strategy.Caculate(3, 4));
		
		strategy = new SubstractStrategy();
		en.setStrategy(strategy);
		System.out.println(strategy.Caculate(3, 4));
		
		strategy = new MultiplyStrategy();
		en.setStrategy(strategy);
		System.out.println(strategy.Caculate(3, 4));
		
		strategy = new DivideStrategy();
		en.setStrategy(strategy);
		System.out.println(strategy.Caculate(3, 4));
		
	}
}
