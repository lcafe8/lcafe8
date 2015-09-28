package com.lcafe8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest1
{
	public static void main(String[] args)
	{
		HashMap<String,String> m = new HashMap<String,String>();
		
		String str = new String("a");
		
		m.put(str, "zhangsan");
		m.put("b", "lisi");
		m.put("c", "wangwu");
		m.put("a", "zhaoliu");
		
		System.out.println(m);
		System.out.println("-------------------");
		
		String value = (String) m.get("b");
		System.out.println(value);
		System.out.println("-------------------");
		
		Set<String> set = m.keySet();
		for(Iterator<String> iter = set.iterator(); iter.hasNext();)
		{
			String key = (String)iter.next();
			System.out.println(key+":"+(String)m.get(key));
		}
		
	}
}
