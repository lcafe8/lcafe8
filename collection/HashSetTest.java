package com.lcafe8.collection;

import java.util.HashSet;

public class HashSetTest
{
	  public static void main(String[] args) 
	  {
	      HashSet books = new HashSet();
	      //�ֱ���books�������������A��������B��������C����
	      books.add(new A());
	      books.add(new A());

	      books.add(new B());
	      books.add(new B());

	      books.add(new C());
	      books.add(new C());
	      System.out.println(books);
	  }
}

/**
 * ��A��equals�������Ƿ���true,��û����д��hashCode()������
 * ���ܱ�֤��ǰ������HashSet�е�Ψһ����
 * @author Administrator
 * @date 2015��9��28��
 */
class A
{
  public boolean equals(Object obj)
  {
      return true;
  }
}

/**
 * ��B��hashCode()�������Ƿ���1,��û����д��equals()������
 * ���ܱ�֤��ǰ������HashSet�е�Ψһ����
 * @author Administrator
 * @date 2015��9��28��
 */
class B
{
  public int hashCode()
  {
      return 1;
  }
}
/**
 * ��C��hashCode()�������Ƿ���2,������д��equals()����
 * @author Administrator
 * @date 2015��9��28��
 */
class C
{
  public int hashCode()
  {
      return 2;
  }
  public boolean equals(Object obj)
  {
      return true;
  }
}