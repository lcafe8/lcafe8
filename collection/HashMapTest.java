package com.lcafe8.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest
{
	public static void main(String[] args)
	{
		int[] arr = { 8, 3, 8, 2, 8, 3, 8, 3, 8, 8, };// ºì°ü
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++)
		{
			int key = arr[i];
			if (map.containsKey(key))
			{
				map.put(key, map.get(key).intValue() + 1);
			} else
			{
				map.put(key, 1);
			}
		}
		Collection<Integer> coll = map.values();
		int max = Collections.max(coll);
		Set<Entry<Integer, Integer>> set = map.entrySet();
		for (Iterator<Entry<Integer, Integer>> iter = set.iterator(); iter.hasNext();)
		{
			Entry<Integer, Integer> entry = iter.next();
			if (entry.getValue() == max)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}
