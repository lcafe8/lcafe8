package com.lcafe8;

public class LNode<T>
{
	public Node<T> first;
	private int pos = 0;
	private int size = 0;

	public void LinkList()
	{
		this.first = null;
	}

	// 在链表头插入结点
	public void AddFirstNode(Node<T> node)
	{
		node.next = first;
		first = node;
		size++;
	}
	
	//在链表尾插入节点
	public void AddLastNode(Node<T> node)
	{
		Node<T> current = first;
		Node<T> previou = first;
		node.next = null;
		while(current != null)
		{
			previou = current;
			current = current.next;
		}
		previou.next = node;
		size++;
	}

	// 在指定位置插入节点
	public void ListInsert(Node<T> node, int i)
	{
		if (i > size)
			return;
		Node<T> current = first;
		Node<T> previous = first;
		while (pos != i)
		{
			previous = current;
			current = current.next;
			pos++;
		}
		node.next = null;
		previous.next = node;
		pos = 0;
		size++;
	}
	
	public void PrintNode()
	{
		Node<T> node = first;
		while(node != null)
		{
			System.err.println(node.data);
			node = node.next;
		}
	}

	// 链表长度
	public int Listsize()
	{
		return size;
	}

	public static void main(String[] args)
	{
		LNode<String> ln = new LNode<String>();

		Node<String> node = new Node<String>("node0");
		ln.AddFirstNode(node);
		Node<String> node1 = new Node<String>("node1");
		ln.ListInsert(node1, 1);
		Node<String> node2 = new Node<String>("node2");
		ln.AddFirstNode(node2);
		Node<String> node3 = new Node<String>("node3");
		ln.AddLastNode(node3);
		System.err.println(ln.Listsize());
		ln.PrintNode();
	}

}
