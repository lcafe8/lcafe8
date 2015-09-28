package com.lcafe8.strategy;

import java.util.LinkedList;
import java.util.List;

public class Client
{
	public static void main(String[] args)
	{
		List<Person> list = new LinkedList<Person>();
		Client client =new Client();
		
		Person p1 = new Person();
		p1.setId(10);
		p1.setAge(20);
		p1.setName("zhangsan");;
		list.add(p1);
		
		Person p2 = new Person();
		p2.setId(11);
		p2.setAge(23);
		p2.setName("wangwu");;
		list.add(p2);
		
		Person p3 = new Person();
		p3.setId(12);
		p3.setAge(25);
		p3.setName("zhangsan");;
		list.add(p3);
		
		Person p4 = new Person();
		p4.setId(14);
		p4.setAge(35);
		p4.setName("Lisi");
		list.add(p4);
		
		Environment en = new Environment(new DescNameSort());//name½µÐò
		en.Sort(list);
		client.PrintList(list);
		
		en.setSortInterface(new AscNameSort());//nameÉýÐò
		en.Sort(list);
		client.PrintList(list);
	}
	
	public void PrintList(List<Person> list)
	{
		for(int i = 0; i < list.size(); i++)
		{
			Person p = list.get(i);
			System.out.println("id: " + p.getId() + ", age: " + p.getAge() + ", name: " + p.getName());
		}
		System.out.println("-----------------------------------");
	}
}
