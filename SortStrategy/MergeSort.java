package com.lcafe8.sortStrategy;
/**
 * �鲢����
 * @author Administrator
 * @date 2015��9��3��
 */
public class MergeSort implements InterfaceSort
{
	static int count = 1;
	public void Sort(int[] arr)
	{
		MSort(arr, 0, arr.length-1);
	}

	public static void MSort(int[] arr, int begin, int end)// �����ϲ�
	{
		if(begin < end)
		{
			int m = (begin + end) / 2;
			MSort(arr, begin, m);
			MSort(arr, m + 1, end);
			Megre(arr, begin, m, end);
		}
		System.out.print("��" + count++ + "��");
		for(int element: arr)
		{
			System.out.print(element + " ");
		}
		System.out.println();
	}
	/**
	 * �ϲ���������
	 * 
	 * @param arr
	 *            ԭʼ��������
	 * @param mergearr
	 *            �ϲ�����
	 * @param i
	 *            ��һ���������п�ʼԪ���±�
	 * @param m
	 *            ��һ�������н���Ԫ���±�
	 * @param n
	 *            �ڶ�����Ԫ�ؽ����±�
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
