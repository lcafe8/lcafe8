package com.lcafe8.strategy;

import java.util.List;

import com.lcafe8.strategy.Person;
import com.lcafe8.strategy.SortInterface;

public class Environment
{
	private SortInterface sortInterface;
	
	public Environment(SortInterface sortInterface)
	{
		this.sortInterface = sortInterface;
	}
	
	public void setSortInterface(SortInterface sortInterface)
	{
		this.sortInterface = sortInterface;
	}
	
	public void Sort(List<Person> list)
	{
		this.sortInterface.Sort(list);
	}
}
