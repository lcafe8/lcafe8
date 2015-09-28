package com.lcafe8.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(new Integer(-8));
		list.add(new Integer(20));
		list.add(new Integer(-20));
		list.add(new Integer(8));
		// list.add(new Integer(8));

		Comparator<Integer> t = Collections.reverseOrder();

		Collections.sort(list, t);

		// for(int i=0;i<list.size();i++)
		// {
		// System.out.println(list.get(i));
		// }
		for (Iterator<Integer> iter = list.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
		System.out.println("--------------");

		Collections.shuffle(list);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}

		System.out.println("maxvalue:" + Collections.max(list));
		System.out.println("minvalue:" + Collections.min(list));

	}
}
