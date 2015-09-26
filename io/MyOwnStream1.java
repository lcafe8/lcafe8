package com.lcafe8.io;

import java.io.IOException;
import java.io.InputStream;

public class MyOwnStream1
{
	public static void main(String[] args)
	{

	}
}

class MyInputStream1 extends InputStream
{
	protected byte[] data;
	protected int ptr = 0;
	protected int mark = 0;

	public MyInputStream1(byte[] data)
	{
		this.data = data;
	}

	@Override
	public int read() throws IOException
	{
		return (ptr < data.length) ? (data[ptr++]) : -1;
	}

	@Override
	public int available() throws IOException
	{
		return data.length - ptr;
	}

	@Override
	public synchronized void mark(int readlimit)
	{
		this.mark = readlimit;
	}

	@Override
	public boolean markSupported()
	{
		return true;
	}

	@Override
	public synchronized void reset() throws IOException
	{
		if (mark < 0 || mark >= data.length)
		{
			throw new IOException("the position is not valid");
		}

		ptr = mark;
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException
	{
		if (this.ptr >= data.length || len < 0)
		{
			return -1;
		}
		if ((this.ptr + len) > data.length)
		{
			len = data.length - this.ptr;
		}
		if (len == 0)
		{
			return 0;
		}

		System.arraycopy(data, ptr, b, off, len);

		ptr += len;

		return len;
	}

}
