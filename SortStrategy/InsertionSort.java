package com.lcafe8.sortStrategy;

/**
 * ֱ�Ӳ�������
 * @author Administrator
 *
 */
public class InsertionSort implements InterfaceSort
{
	public void Sort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i - 1] > arr[i])
			{
				int key = arr[i];
				int j = i - 1;
				arr[i] = arr[i - 1];
				for (; j >= 1 && arr[j - 1] > key; --j)
				{
					arr[j] = arr[j - 1];
				}
				arr[j] = key;
			}
			System.out.print("��" + i + "��: ");
			for(int element: arr)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
