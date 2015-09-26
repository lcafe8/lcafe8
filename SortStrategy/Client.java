package com.lcafe8.SortStrategy;

public class Client
{
	public static void main(String[] args)
	{
		int[] arr = null;
		Client client = new Client();
		arr = client.InitArray();

		Environment en = new Environment(new BubbleSort());
		en.Sort(arr);
		System.out.print("ð������ ");
		for (int element : arr)
		{
			System.out.print(element + " ");
		}
		System.out.println("\n-----------------------------------------");

		en.setInterfaceSort(new InsertionSort());
		arr = client.InitArray();
		en.Sort(arr);
		System.out.print("ֱ�Ӳ������� ");
		for (int element : arr)
		{
			System.out.print(element + " ");
		}
		System.out.println("\n------------------------------------------");

		en.setInterfaceSort(new ShellSort());
		arr = client.InitArray();
		en.Sort(arr);
		System.out.print("ϣ������ ");
		for (int element : arr)
		{
			System.out.print(element + " ");
		}
		System.out.println("\n------------------------------------------");

		en.setInterfaceSort(new SimpleSeletionSort());
		arr = client.InitArray();
		en.Sort(arr);
		System.out.print("��ѡ������ ");
		for (int element : arr)
		{
			System.out.print(element + " ");
		}
		System.out.println("\n------------------------------------------");

		en.setInterfaceSort(new DoubleSelectionSort());
		arr = client.InitArray();
		en.Sort(arr);
		System.out.print("��Ԫѡ������ ");
		for (int element : arr)
		{
			System.out.print(element + " ");
		}
		System.out.println("\n------------------------------------------");

		en.setInterfaceSort(new HeapSort());
		arr = client.InitArray();
		en.Sort(arr);
		System.out.print("������ ");
		for (int element : arr)
		{
			System.out.print(element + " ");
		}
		System.out.println("\n------------------------------------------");

		en.setInterfaceSort(new QuickSort());
		arr = client.InitArray();
		en.Sort(arr);
		System.out.print("�������� ");
		for (int element : arr)
		{
			System.out.print(element + " ");
		}
		System.out.println("\n------------------------------------------");

		en.setInterfaceSort(new MergeSort());
		arr = client.InitArray();
		en.Sort(arr);
		System.out.print("�鲢���� ");
		for (int element : arr)
		{
			System.out.print(element + " ");
		}
		System.out.println("\n------------------------------------------");
	}

	public int[] InitArray()
	{
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 49, 55, 04 };
		return arr;
	}
}
