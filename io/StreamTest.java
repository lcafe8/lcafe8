package com.lcafe8.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamTest
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos = new FileOutputStream("C:/text/hello.txt");

		OutputStreamWriter osw = new OutputStreamWriter(fos);

		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("abc defghij klmn");
		bw.write("\n");
		bw.write("you are good");

		bw.close();

		FileInputStream fis = new FileInputStream("C:/text/hello.txt");

		InputStreamReader isr = new InputStreamReader(fis);

		BufferedReader br = new BufferedReader(isr);

		String str = br.readLine();
		while (null != str)
		{
			System.out.println(str);
			str = br.readLine();
		}
		br.close();

	}
}
