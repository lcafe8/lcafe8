package com.lcafe8.SortStrategy;

/**
 * ºÚµ•—°‘Ò≈≈–Ú
 * @author Administrator
 *
 */
public class SimpleSeletionSort implements InterfaceSort
{
	public void Sort(int[] arr)
	{
		SimpleSeletionSort s = new SimpleSeletionSort();
		for(int i = 0; i < arr.length; i++)
		{
			int key = s.SelectMinKey(arr, i);
			if(i != key)
			{
				int temp = arr[key];
				arr[key] = arr[i];
				arr[i] = temp;
			}
			System.out.print("µ⁄" + (i+1) + "ÃÀ: ");
			for(int element: arr)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
	public int SelectMinKey(int[] arr, int i)
	{
		int key = i;
		for(int j = i+1; j < arr.length; j++)
		{
			if(arr[j] < arr[key])
			{
				key = j; 
			}
		}
		return key;
	}
}
