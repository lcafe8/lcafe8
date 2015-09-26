package com.lcafe0907;

import java.lang.reflect.Array;

public class RefectionTest3
{
	public static void main(String[] args) throws Exception
	{
		Class<?> class1 = Class.forName("java.lang.String");
		Object arr = Array.newInstance(class1, 10);

		Array.set(arr, 5, "Tom");
		String s = (String) Array.get(arr, 5);

		System.out.println(s);
		System.out.println("-----------------");

		int[] dims = new int[] { 5, 10, 15 };
		// 创建多维数组，数组dims中的元素是数组的维数
		Object array = Array.newInstance(Integer.TYPE, dims);
		Object arrayObj = Array.get(array, 3);
		Class<?> classType = array.getClass().getComponentType();
		arrayObj = Array.get(arrayObj, 5);
		Array.setInt(arrayObj, 10, 45);

		int[][][] arrayCast = (int[][][]) array;
		System.out.println(arrayCast[3][5][10]);

	}
}
