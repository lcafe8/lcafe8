package com.lcafe8.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteArrayOutputStreamTest
{
	public static void main(String[] args) throws Exception
	{
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		String str = "Hello world";

		byte[] buffer = str.getBytes();

		out.write(buffer);

		byte[] result = out.toByteArray();

		for (int i = 0; i < result.length; i++)
		{
			System.out.println((char) result[i]);
		}

		OutputStream os = new FileOutputStream("C:/text/hello.txt");

		out.writeTo(os);

		out.close();
		os.close();

	}
}
