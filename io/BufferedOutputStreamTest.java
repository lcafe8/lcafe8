package com.lcafe8.io;

import java.io.BufferedOutputStream;
  import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputStreamTest
{
	public static void main(String[] args) throws Exception
	{
		OutputStream output = new FileOutputStream("C:/text/buffer.txt");
		
		BufferedOutputStream os = new BufferedOutputStream(output);
		
		os.write("www.baidu.com".getBytes());
		
		os.close();
	}
}
