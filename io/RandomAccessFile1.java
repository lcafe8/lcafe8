package com.lcafe8.io;

import java.io.RandomAccessFile;

public class RandomAccessFile1
{
	public static void main(String[] args) throws Exception
	{
		Person person = new Person(8, "lisi", 172.6);

		RandomAccessFile raf = new RandomAccessFile("C:/text/random.txt", "rw");

		person.write(raf);
		
		raf.seek(0);
		
		Person p = new Person();
		
		p.read(raf);
	}
}

class Person
{
	private int id;
	private String name;
	private double height;

	public Person()
	{

	}

	public Person(int id, String name, double height)
	{
		this.id = id;
		this.name = name;
		this.height = height;
	}

	public void write(RandomAccessFile raf) throws Exception
	{
		raf.writeInt(this.id);
		raf.writeUTF(this.name);
		raf.writeDouble(this.height);
	}
	
	public void read(RandomAccessFile raf) throws Exception
	{
		System.out.println(raf.readInt());
		System.out.println(raf.readUTF());
		System.out.println(raf.readDouble());
	}

}