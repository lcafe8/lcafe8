package com.lcafe8.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest1
{
	public static void main(String[] args) throws Exception
	{
		OutputStream output = new FileOutputStream("C:/text/output.txt",true);
		
		String str = "Hello World";
		
		byte[] buffer = str.getBytes();
		
		output.write(buffer);
		
		output.close();
	}
}
