package com.lcafe8.network;

import java.net.InetAddress;

public class InetAddressTest
{
	public static void main(String[] args) throws Exception
	{
		/**
		 * InetAddress û�й��췽��
		 */
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);

		address = InetAddress.getByName("www.sohu.com");
		System.out.println(address);
	}
}
