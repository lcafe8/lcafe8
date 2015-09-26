package com.lcafe8.clone;

public class CloneTest2
{
	public static void main(String[] args) throws Exception
	{
		Teacher teacher = new Teacher();

		teacher.setAge(43);
		teacher.setName("Teacher");

		Student2 student = new Student2();

		student.setAge(18);
		student.setName("student");
		student.setTeacher(teacher);

		Student2 s2 = (Student2) student.clone();

		System.out.println(s2.getAge());
		System.out.println(s2.getName());

		teacher.setName("Teacher Li");

		System.out.println(student.getTeacher().getAge());
		System.out.println(student.getTeacher().getName());
		System.out.println(s2.getTeacher().getAge());
		System.out.println(s2.getTeacher().getName());
	}
}

class Teacher implements Cloneable
{
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

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Student2 implements Cloneable
{
	private Teacher teacher;
	private int age;
	private String name;

	public Teacher getTeacher()
	{
		return teacher;
	}

	public void setTeacher(Teacher teacher)
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

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Student2 student2 = (Student2) super.clone();
		student2.setTeacher((Teacher)student2.getTeacher().clone());
		return student2;
	}

}