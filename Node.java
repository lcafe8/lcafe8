package com.lcafe8;

public class Node<T>
{
	String data;
	Node<T> next;
	
	//���췽��û�з�������
	public Node(String data)
	{
		this.data=data;
	}
	
	//��ӡ����
	public void PrintNode(Node<T> node)
	{
		while(node != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}

}
