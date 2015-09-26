package com.lcafe8.io;

import java.io.File;

public class FileTest3
{
	public static void main(String[] args)
	{
		File file = new File("C:/inetpub");
		
		String[] names = file.list();
		
		for(String string: names)
		{
			System.out.println(string);
		}
		
		File[] files = file.listFiles();
		
		for(File f:files)
		{
			System.out.println(f.getName());
		}
	}

}
