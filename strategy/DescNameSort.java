package com.lcafe8.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 按name降序排序,name相同，按id升序
 * @author Administrator
 */
public class DescNameSort implements SortInterface, Comparator<Person>
{
	@Override
	public void Sort(List<Person> list)
	{
		Collections.sort(list,this);
//		Collections.sort(list, new DescNameSort());
	}
	
	@Override
	public int compare(Person o1, Person o2)
	{
		if(o1.getName().equals(o2.getName()))
		{
			return o1.getId() - o2.getId();
		}
		return o1.getName().compareTo(o2.getName());
	}
}
