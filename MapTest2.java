package com.lcafe8;

import java.util.HashMap;

public class MapTest2
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		for(int i=0;i<args.length;++i)
		{
			if(map.containsKey(args[i]))
			{
				Integer in = (Integer)map.get(args[i]);
				in = new Integer(in.intValue()+1);
 				map.put(args[i],in);
			}
			else
			{
				map.put(args[i], new Integer(1));
			}
		}
		
		System.out.println(map);
	}
}
