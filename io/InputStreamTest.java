package com.lcafe8.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		InputStream input = new FileInputStream("c:/text/test.txt");
		
		byte[] buffer = new byte[200];
		
		int length = 0;
		
		while(-1 != (length = input.read(buffer, 0, 200)))
		{
			String str = new String(buffer,0,length);
			System.out.println(str);
		}
		
		input.close();
		
	}
}
