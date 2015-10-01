package com.lcafe8.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlConnection
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://www.sohu.com");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String line;
		while(null != (line = br.readLine()))
		{
			System.out.println(line);
		}
		
		br.close();
	}
}
