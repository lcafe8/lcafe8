package com.lcafe8.network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UrlConnection2
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://www.pm25.in/zunyi");

//		URLConnection conn = url.openConnection();
//
//		InputStream is = conn.getInputStream();
		
		InputStream is = url.openStream();

		OutputStream os = new FileOutputStream("c:/text/zunyi.txt");

		byte[] buffer = new byte[2048];

		int lenght = 0;

		while (-1 != (lenght = is.read(buffer, 0, buffer.length)))
		{
			os.write(buffer, 0, lenght);
		}
		is.close();
		os.close();
	}
}
