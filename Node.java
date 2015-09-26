package com.lcafe8;

public class Node
{
	String data;
	Node next;
	
	//构造方法没有返回类型
	public Node(String data)
	{
		this.data=data;
	}
	
	//打印数据
	public void PrintNode(Node node)
	{
		while(node != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}

}
