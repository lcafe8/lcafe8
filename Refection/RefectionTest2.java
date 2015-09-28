package com.lcafe8.refection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefectionTest2
{
	// 该方式实现对Customer对象拷贝操作
	public Object copy(Object object) throws Exception
	{
		Class<?> classType = object.getClass();

		Constructor<?> con = classType.getConstructor(new Class[] {});
		Object obj = con.newInstance(new Object[] {});
		// Object obj2 = classType.newInstance();//上面两行等价于这一行

		// 获取对象所有成员变量
		Field[] fields = classType.getDeclaredFields();
		// System.out.println(obj instanceof Object);
		// System.out.println("-------------------------");
		for (Field field : fields)
		{
			String name = field.getName();
			String firstLetter = name.substring(0, 1).toUpperCase();

			String getMethodName = "get" + firstLetter + name.substring(1);
			String setMethodName = "set" + firstLetter + name.substring(1);

			Method getMethod = classType.getMethod(getMethodName, new Class[] {});
			Method setMethod = classType.getMethod(setMethodName, new Class[] { field.getType() });

			Object getValue = getMethod.invoke(object, new Object[] {});
			setMethod.invoke(obj, new Object[] { getValue });

		}
		return obj;
	}

	public static void main(String[] args) throws Exception
	{
		Customer customer = new Customer("Tom", 12);
		customer.setId(1001L);
		RefectionTest2 rTest2 = new RefectionTest2();
		Customer customer2 = (Customer) rTest2.copy(customer);
		System.out.println(customer2.getId() + "," + customer2.getName() 
							+ "," + customer2.getAge());
	}
}

class Customer
{
	private Long id;
	private String name;
	private int age;

	public Customer()
	{

	}

	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}
