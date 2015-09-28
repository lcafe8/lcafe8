package com.lcafe8.collection;

/***
 * 自定义比较器
 */
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet<String> set = new TreeSet<String>(new Mycomparator());
		
		set.add("C");
		set.add("A");
		set.add("B");
		set.add("E");
		set.add("F");
		set.add("D");
		
		for(Iterator<String> iter = set.iterator();iter.hasNext();)
		{
			String value = (String)iter.next();
			
			System.out.println(value);
		}
	}
}

class Mycomparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);
	}
}
