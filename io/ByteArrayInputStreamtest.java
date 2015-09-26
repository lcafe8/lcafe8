package com.lcafe8.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamtest
{
	public static void main(String[] args)
	{
		String temp = "asdsf0sdfs";
		
		byte[] b =  temp.getBytes();
		
		ByteArrayInputStream in = new ByteArrayInputStream(b);
		
		for(int i = 0;i < 2;i++)
		{
			int c ;
			while( -1 != (c = in.read()))
			{
				if(0 == i)
				{
					System.out.print((char)c + " ");
				}
				else
				{
					System.out.print(Character.toUpperCase((char)c) + " ");
				}
			}
			
			System.out.println();
			
			in.reset();
		}	
	}
}
