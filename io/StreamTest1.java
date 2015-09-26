package com.lcafe8.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreamTest1
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);

		String str ;
		
		while((str=br.readLine()) != null)
		{
			System.out.println(str);
		}
		
		br.close();
		
	}
}
