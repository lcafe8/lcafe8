package com.lcafe8.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStream1
{
	public static void main(String[] args) throws IOException
	{
		// 节点流
		OutputStream output = new FileOutputStream("C:/text/data.txt");

		// buffer过滤流
		BufferedOutputStream buffer = new BufferedOutputStream(output);

		// 数据过滤流
		DataOutputStream data = new DataOutputStream(buffer);

		byte b = 3;
		int i = 12;
		char c = 'w';
		float f = 3.3f;

		data.writeByte(b);
		data.writeInt(i);
		data.writeChar(c);
		data.writeFloat(f);

		data.close();

		// 节点流
		InputStream input = new FileInputStream("C:/text/data.txt");

		// buffer过滤流
		BufferedInputStream buffer1 = new BufferedInputStream(input);

		// 数据过滤流
		DataInputStream data1 = new DataInputStream(buffer1);

		// 读与写顺序一致
		System.out.println(data1.readByte());
		System.out.println(data1.readInt());
		System.out.println(data1.readChar());
		System.out.println(data1.readFloat());

		data1.close();

	}
}
