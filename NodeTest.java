package com.lcafe8;

public class NodeTest
{
	public static void main(String[] args)
	{
		Node<String> node1 = new Node<String>("node1");
		Node<String> node2 = new Node<String>("node2");
		Node<String> node3 = new Node<String>("node3");
		Node<String> node4 = new Node<String>("node4");
		
		node1.next = node2;		
		node2.next = node3;
		node1.PrintNode(node1);
		
		System.out.println("-------------");
		
		node1.next = node4;
		node4.next = node2;
		node1.PrintNode(node1);
		
		System.out.println("--------------");
		
		node1.next=node2;
		node4=null;
		node1.PrintNode(node1);

		
	}
}
