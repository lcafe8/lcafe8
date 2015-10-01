package com.lcafe8.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket serverSocket = new ServerSocket(5000);
		
		System.out.println("The Server is start£º");
		
		Socket socket = serverSocket.accept();

		System.out.println("Accept the Client: " + socket); 
		
		InputStream is = socket.getInputStream();
		
		OutputStream os = socket.getOutputStream();

		byte[] buffer = new byte[200];

		int length = 0;
		
		length = is.read(buffer);
		
		String str = new String(buffer,0,length);
		System.out.println(str);
		
//		while (-1 != (length = is.read(buffer, 0, buffer.length)))
//		{
//			String str = new String(buffer, 0, length);
//			System.out.println(str);
//		}

		os.write("Welcome".getBytes());

		is.close();
		os.close();
		socket.close();
	}
}
