package com.lcafe8.sortStrategy;

public class Environment
{
	private InterfaceSort interfaceSort;
	
	public Environment(InterfaceSort interfaceSort)
	{
		this.interfaceSort = interfaceSort;
	}

	public void setInterfaceSort(InterfaceSort interfaceSort)
	{
		this.interfaceSort = interfaceSort;
	}
	
	public void Sort(int[] arr)
	{
		this.interfaceSort.Sort(arr);
	}

}
