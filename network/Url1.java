package com.lcafe8.network;

import java.net.URL;

public class Url1
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://www.baidu.com");
		
		String protocal = url.getProtocol();
		String host = url.getHost();
		
		System.out.println(protocal + "," + host);
	}
}
