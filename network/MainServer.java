package com.lcafe8.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket serverSocket = new ServerSocket(4000);
		System.out.println("Server:");

		while (true)
		{
			Socket socket = serverSocket.accept();

			// Æô¶¯¶ÁÐ´Ïß³Ì
			new ServerInputThread(socket).start();
			new ServerOutputThread(socket).start();
		}
	}
}

class ServerInputThread extends Thread
{
	private Socket socket;

	public ServerInputThread(Socket socket)
	{
		this.socket = socket;
	}

	@Override
	public void run()
	{
		try
		{
			InputStream is = socket.getInputStream();

			while (true)
			{
				byte[] buffer = new byte[1024];

				int length = is.read(buffer);

				String str = new String(buffer, 0, length);

				System.out.println(str);
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

class ServerOutputThread extends Thread
{
	private Socket socket;

	public ServerOutputThread(Socket socket)
	{
		this.socket = socket;
	}

	@Override
	public void run()
	{
		try
		{
			OutputStream os = socket.getOutputStream();

			while (true)
			{
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				String line = reader.readLine();
				
				os.write(line.getBytes());
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
