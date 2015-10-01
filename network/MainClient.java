package com.lcafe8.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class MainClient
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("localhost",4000);
		System.out.println("Client:");
		new ClientInputThread(socket).start();
		new ClientOutputThread(socket).start();
	}
}

class ClientInputThread extends Thread
{
	private Socket socket;

	public ClientInputThread(Socket socket)
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

class ClientOutputThread extends Thread
{
	private Socket socket;

	public ClientOutputThread(Socket socket)
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
