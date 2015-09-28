package com.lcafe8.sortStrategy;
/**
 * 快速排序
 * @author Administrator
 * @date 2015年9月3日
 */
public class QuickSort implements InterfaceSort
{
	
	public void Sort(int[] arr)
	{
		QuickSort q = new QuickSort();
		q.QSort(arr, 0, arr.length-1);
	}
	
	public void QSort(int[] arr, int low, int high)
	{
		QuickSort q = new QuickSort();
		if(low < high)
		{
			int pivotkey = q.Portition(arr, low, high);
//			System.out.print("第" + pivotkey + "趟: ");
//			for(int element: arr)
//			{
//				System.out.print(element + " ");
//			}
//			System.out.println();
			q.QSort(arr, low, pivotkey-1);
			q.QSort(arr, pivotkey+1, high);
		}
	}
	
	public int Portition(int[] arr, int low, int high)
	{
		DoubleSelectionSort d = new DoubleSelectionSort();
		int key = arr[low];
		while(low < high)
		{
			while (low < high && arr[high] >= key)
			{
				--high;
			}
			d.Swap(arr, low, high);
			while(low < high && arr[low] <= key)
			{
				++low;
			}
			d.Swap(arr, low, high);
			for(int element: arr)
			{
				System.out.print(element + " ");
			}
			System.out.println("low=" + low + " " + "high=" + high);
		}
		return low;
	}

}
