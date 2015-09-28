package com.lcafe8.annotation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@AnnotatianTest(value2 = EnumTest.Hello)
public class SuppressWarningsTest
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		Map<String,Date> map = new HashMap<String,Date>();
		map.put("Hello", new Date());
		System.out.println(map.get("Hello"));
	}
}
