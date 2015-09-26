package com.lcafe8.io;

import java.io.File;
import java.io.IOException;

public class FileTest1
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:/text");
		
		File file2 = new File(file,"text.txt");
		
		System.out.println(file2.createNewFile());
	}
}
