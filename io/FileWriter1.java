package com.lcafe8.io;

import java.io.CharArrayReader;
import java.io.FileWriter;

public class FileWriter1
{
	public static void main(String[] args) throws Exception
	{
		String str = "hello world,i like you";
		
		char[] buffer = new char[str.length()];
		
		str.getChars(0, str.length(), buffer, 0);
		
		FileWriter fw = new FileWriter("C:/text/file.txt");
		
		for(int i = 0; i < buffer.length; i++)
		{
			fw.write(buffer[i]);
		}
		
		fw.close();
		
		//CharArrayReader
		CharArrayReader  car = new CharArrayReader(buffer);
		 
		int i ;
		while(-1 != (i=car.read()))
		{
			System.out.print((char)i);
		}
		
		car.close();
		
		
		
		
		
		
		
		
	}
}
