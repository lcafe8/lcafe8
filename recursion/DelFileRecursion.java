package com.lcafe8.recursion;

import java.io.File;
import java.io.IOException;

public class DelFileRecursion
{

	public void del(File file)
	{
		if (file.isFile() || file.list().length == 0)
		{
			System.out.println(file);
			file.delete();
		} else
		{
			File[] names = file.listFiles();

			for (File name : names)
			{
				del(name);
			}
			System.out.println(file);
			file.delete();
		}
	}

	public static void main(String[] args) throws IOException
	{
		File file = new File("C:/text");

		String[] names = file.list();

		for (String name : names)
		{
			System.out.println(name);
		}

		DelFileRecursion fileTest4 = new DelFileRecursion();
		fileTest4.del(file);
	}
}
