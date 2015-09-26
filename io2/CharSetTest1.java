package com.lcafe8.io2;

import java.nio.charset.Charset;
import java.util.Set;
import java.util.SortedMap;

public class CharSetTest1
{
	public static void main(String[] args)
	{
		SortedMap<String, Charset> map = Charset.availableCharsets();

		Set<String> set = map.keySet();

		for (String str : set)
		{
			System.out.println(str);
		}
	}
}
