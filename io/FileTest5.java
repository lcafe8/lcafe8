package com.lcafe8.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest5
{
	public static void main(String[] args)
	{
		File file = new File("C:/text");
		
		String[] names = file.list();
		
		for(String name: names)
		{
			if(name.endsWith(".java"))
			{
				System.out.println(name);
			}
		}
		
		String[] names1 = file.list(new FilenameFilter()
		{
			@Override
			public boolean accept(File dir, String name)
			{
				if(name.endsWith(".txt"))
				{
					return true;
				}
				return false;
			}
		});
		
		for(String name: names1)
		{
			System.out.println(name);
		}
	}
}
