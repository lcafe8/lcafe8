package com.lcafe8.io;

import java.io.File;

public class FileTest2
{
	public static void main(String[] args)
	{
		File  file = new File("C:/abc/xyz/hello");
		
		System.out.println(file.mkdirs());
	}
}
