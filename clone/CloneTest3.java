package com.lcafe8.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneTest3
{
	public static void main(String[] args) throws Exception
	{
		Teacher2 t = new Teacher2();

		t.setAge(43);
		t.setName("Teacher zhang");

		Student3 s1 = new Student3();

		s1.setAge(20);
		s1.setName("zhangsan");
		s1.setTeacher2(t);

		Student3 s3 = (Student3) s1.deppCopy();

		System.out.println(s3.getAge());
		System.out.println(s3.getName());

		System.out.println("----------------------");

		System.out.println(s3.getTeacher2().getAge());
		System.out.println(s3.getTeacher2().getName());

		s3.getTeacher2().setAge(50);
		s3.getTeacher2().setName("Teacher liu");

		System.out.println("----------------------");
		System.out.println(s3.getTeacher2().getAge());
		System.out.println(s3.getTeacher2().getName());

		System.out.println("----------------------");
		System.out.println(s1.getTeacher2().getAge());
		System.out.println(s1.getTeacher2().getName());

	}
}

class Teacher2 implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

class Student3 implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Teacher2 teacher;
	private int age;
	private String name;

	public Teacher2 getTeacher2()
	{
		return teacher;
	}

	public void setTeacher2(Teacher2 teacher)
	{
		this.teacher = teacher;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Object deppCopy() throws Exception
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		ObjectOutputStream oos = new ObjectOutputStream(bos);

		oos.writeObject(this);

		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());

		ObjectInputStream ois = new ObjectInputStream(bis);

		return ois.readObject();

	}
}