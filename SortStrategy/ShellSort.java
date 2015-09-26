package com.lcafe8.SortStrategy;

/**
 * 希尔排序
 * @author Administrator
 *
 */
public class ShellSort implements InterfaceSort
{

	public void Sort(int[] arr)
	{
		int dk = arr.length / 2;//增量
		while(dk >= 1)
		{	
			for(int i = dk; i < arr.length; i++)
			{
				if (arr[i - dk] > arr[i])
				{
					int key = arr[i];
					int j = i - dk;
					arr[i] = arr[i-dk];
					for(; j >= dk && arr[j-dk] > key; j-=dk)
					{
						arr[j] = arr[j - dk];
					}
					arr[j] = key;
				}
			}
			System.out.print("增量dk=" + dk + ": ");
			for(int element: arr)
			{
				System.out.print(element + " ");
			}
			System.out.println();
			dk = dk-2;
		}
	}

}
