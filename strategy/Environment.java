package com.lcafe0831.Strategy;

import java.util.List;

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
