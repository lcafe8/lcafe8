package com.lcafe8.io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable2
{
	public static void main(String[] args) throws Exception
	{
		Person1 p1 = new Person1(20, "zhangsan", 4.55);
		Person1 p2 = new Person1(50, "lisi", 4.67);
		Person1 p3 = new Person1(10, "wangwu", 17.78);

		FileOutputStream fos = new FileOutputStream("C:/text/person.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		oos.close();

		FileInputStream fis = new FileInputStream("C:/text/person.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		System.out.println("--------------------------------");
		
		Person1 p = null;
		for (int i = 0; i < 3; i++)
		{
			p = (Person1) ois.readObject();
			System.out.println(p.age + "," + p.name + "," + p.height);
		}
		ois.close();
	}
}

class Person1 implements java.io.Serializable
{
	int age;
	String name;
	double height;

	public Person1(int age, String name, double height)
	{
		this.age = age;
		this.name = name;
		this.height = height;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException
	{
		out.writeInt(age);
		out.writeUTF(name);
		System.out.println("write object");
	}
	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		age = in.readInt();
		name = in.readUTF();
		System.out.println("read object");
	}

}
