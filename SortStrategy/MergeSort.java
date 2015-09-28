package com.lcafe8.sortStrategy;
/**
 * 归并排序
 * @author Administrator
 * @date 2015年9月3日
 */
public class MergeSort implements InterfaceSort
{
	static int count = 1;
	public void Sort(int[] arr)
	{
		MSort(arr, 0, arr.length-1);
	}

	public static void MSort(int[] arr, int begin, int end)// 迭代合并
	{
		if(begin < end)
		{
			int m = (begin + end) / 2;
			MSort(arr, begin, m);
			MSort(arr, m + 1, end);
			Megre(arr, begin, m, end);
		}
		System.out.print("第" + count++ + "趟");
		for(int element: arr)
		{
			System.out.print(element + " ");
		}
		System.out.println();
	}
	/**
	 * 合并两个序列
	 * 
	 * @param arr
	 *            原始数组序列
	 * @param mergearr
	 *            合并数组
	 * @param i
	 *            第一个数组序列开始元素下标
	 * @param m
	 *            第一数组序列结束元素下标
	 * @param n
	 *            第二数组元素结束下标
	 */
	public static void Megre(int[] arr, int i, int m, int n)
	{
		int[] mergearr = new int[arr.length];
		int j = m + 1, k=i, tmp = i;
		while (k <= m && j <= n)
		{
			if (arr[i] <= arr[j])
			{
				mergearr[k++] = arr[i++];
			} 
			else
			{
				mergearr[k++] = arr[j++];
			}
		}
		while (j <= n)
		{
			mergearr[k++] = arr[j++];
		}
		while (i <= m)
		{
			mergearr[k++] = arr[i++];
		}
		
		while (tmp <= n) {
			arr[tmp] = mergearr[tmp++];
		}
	}

}
