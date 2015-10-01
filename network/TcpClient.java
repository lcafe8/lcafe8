package com.lcafe8.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("localhost",5000);
		
		OutputStream os = socket.getOutputStream();
		
		os.write("hello,world!".getBytes());
				
		InputStream is = socket.getInputStream();
		
		byte[] buffer = new byte[200];
		
		int length = 0;
		
		length = is.read(buffer);
		
		System.out.println("Accept the Server: " + socket); 
		String str = new String(buffer,0,length);
		System.out.println(str);
		
//		while(-1 != (length = is.read(buffer, 0, buffer.length)));
//		{
//			String str = new String(buffer,0,length);
//			System.out.println(str);
//		}
		
		is.close();
		is.close();
		socket.close();	
	}	
}
