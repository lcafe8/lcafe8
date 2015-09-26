package com.lcafe8.io;

import java.io.IOException;
import java.io.InputStream;

public class MyOwnStream
{
	public static void main(String[] args) throws Exception
	{
		String str = "550025";
		byte[] b = str.getBytes();

		MyInputStream m = new MyInputStream(b);

		while (true)
		{
			int c = m.read();
			if (c < 0)
			{
				break;
			}
			System.out.print((char) c + " ");
		}
	}
}

class MyInputStream extends InputStream
{
	protected byte[] data;
	protected int ptr = 0;

	public MyInputStream(byte[] data)
	{
		this.data = data;
	}

	@Override
	public int read() throws IOException
	{
		return (ptr < data.length) ? (data[ptr++]) : -1;
	}

}
