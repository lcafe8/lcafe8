package com.lcafe8.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader1
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("D:\\eclipse\\workspace\\javacode\\src\\com\\lcafe8\\io\\FileReader1.java");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str ;
		
		while(null != (str = br.readLine()))
		{
			System.out.println(str);
		}
		br.close();
	}
}
