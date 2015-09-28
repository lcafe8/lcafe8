package com.lcafe8;

public class Node<T>
{
	String data;
	Node<T> next;
	
	//构造方法没有返回类型
	public Node(String data)
	{
		this.data=data;
	}
	
	//打印数据
	public void PrintNode(Node<T> node)
	{
		while(node != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}

}
