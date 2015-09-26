package com.lcafe8;

public class NodeTest1
{
	public static void main(String[] args)
	{
		DoubleNode node1 = new DoubleNode("node1");
		DoubleNode node2 = new DoubleNode("node2");
		DoubleNode node3 = new DoubleNode("node3");
		DoubleNode node4 = new DoubleNode("node4");
		
		node1.next = node2;
		node2.prevoius = node1;
		
		node2.next = node3;
		node3.prevoius = node2;
		
		node3.next = node1;
		node1.prevoius = node3;
		
		System.out.println(node3.next.data);
		
		System.out.println("-------------");
		
		node1.next = node4;
		node4.prevoius = node1;
		
		node4.next = node2;
		node2.prevoius = node4;
		
		System.out.println(node1.next.data);
		System.out.println("-------------");
		
		
		node1.next = node2;
		node2.prevoius = node1;
		node4.prevoius=null;
		node4=null;
		
		System.out.println(node1.next.data);
		

		
	}
	
}
