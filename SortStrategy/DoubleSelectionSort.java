package com.lcafe8.SortStrategy;
/**
 * 两路插入排序
 * @author Administrator
 * @date 2015年9月3日
 */
public class DoubleSelectionSort implements InterfaceSort
{
	public void Sort(int[] arr)
	{
		DoubleSelectionSort d = new DoubleSelectionSort(); 
		int min,max,n;
		for(int i = 0; i < arr.length/2; i++)
		{
			min = max = i;
			n=arr.length-1;
			for(int j = i+1; j < arr.length-i; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
					continue;
				}
				if(arr[j] > arr[max])
				{
					max = j; 
				}
			}
			if(i == max && n-i == min)
			{
				d.Swap(arr, min, max);
			}
			else
			{
				if(i == max)
				{
					d.Swap(arr, max, n-i);
					d.Swap(arr, min, i);
				}
				else if(n-i == min)
				{
					d.Swap(arr, min, i);
					d.Swap(arr, max, n-i);
				}
				else
				{
					d.Swap(arr, min, i);
					d.Swap(arr, max, n-i);
				}
			}
			System.out.print("第" + (i+1) + "趟: ");
			for(int element: arr)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
	public void Swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
