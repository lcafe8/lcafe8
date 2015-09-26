package com.lcafe8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1
{
	public static void main(String[] args)
	{
		TreeSet set = new TreeSet(new Studentcomparator());
		
		Student s1 = new Student(10);
		Student s2 = new Student(20);
		Student s3 = new Student(30);
		Student s4 = new Student(40);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		for(Iterator iter = set.iterator();iter.hasNext();)
		{
			Student value = (Student)iter.next();
			
			System.out.println(value.score);
		}
		
	}
}

class Student
{
	int score;
	
	public Student(int score)
	{
		this.score = score;
	}
	@Override
	public String toString()
	{
		return String.valueOf(score);
	}
}

class Studentcomparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		if(s1.score > s2.score)
		{
			return 1;
		}
		else if(s1.score == s2.score)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}