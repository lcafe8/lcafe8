package com.lcafe0831.Strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Administrator
 * ∞¥name…˝–Ú≈≈–Ú
 */
public class AscNameSort implements SortInterface,Comparator<Person>
{
	@Override
	public void Sort(List<Person> list)
	{
		Collections.sort(list, this);
//		Collections.sort(list, new AscNameSort());
	}
	
	@Override
	public int compare(Person o1, Person o2)
	{
		if(o1.getName().equals(o2.getName()))
		{
			return o1.getId() - o2.getId();
		}
		return o2.getName().compareTo(o1.getName());
	}	
	
}

