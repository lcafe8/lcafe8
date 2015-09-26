package com.lcafe8.clone;

public class CloneTest1
{
	public static void main(String[] args) throws Exception
	{
		Student student = new Student();
		
		student.setAge(23);
		student.setName("zhangsan");
		
		Student student2 = (Student) student.clone();
		
		System.out.println(student.getName());
		System.out.println(student2.getAge());
		
		System.out.println("-------------------");
		student2.setName("lisi");//字符串类,添加字符串就是创建新对象。
		
		System.out.println(student.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getName());
	}
}

class Student implements Cloneable
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
		Object object = super.clone();
		return object;
	}

}