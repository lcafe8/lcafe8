package com.lcafe8.SortStrategy;
/**
 * ������
 * @author Administrator
 * @date 2015��9��3��
 */
public class HeapSort implements InterfaceSort
{
	public void Sort(int[] arr)
	{
		HeapSort h = new HeapSort();
		h.HeapBuild(arr);
		// �����һ��Ԫ�ؿ�ʼ�����н��е���
		for (int i = arr.length - 1; i > 0; --i)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			h.HeapAdjuest(arr, 0, i);
			System.out.print("��" + (arr.length - i) + "�ˣ� ");
			for (int element : arr)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	public void HeapBuild(int[] arr)
	{
		HeapSort h = new HeapSort();
		for (int i = (arr.length - 1) / 2; i >= 0; --i)
		{
			h.HeapAdjuest(arr, i, arr.length);
		}
		System.out.print("��ʼ�ѣ� ");
		for (int element : arr)
		{
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public void HeapAdjuest(int[] arr, int i, int length)
	{
		int temp = arr[i];
		int child = 2 * i + 1;
		while (child < length)
		{
			if (child + 1 < length && arr[child + 1] > arr[child]) // ������Һ��ӣ��Ƚ����Ӻ��Һ��Ӵ�С��
			{
				++child;
			}
			if (arr[child] > arr[i])
			{
				arr[i] = arr[child];// ����ǰ�ڵ㻻�����ӻ��Һ���
				i = child;
				child = 2 * i + 1;// ����ǰ�ƶ����ӵĽڵ���Ϊ��һ���������ڵ�
			} else
			{
				break;
			}
			arr[i] = temp;// ��ǰ�������Ľ��ŵ�����С�ĺ��ӽ��λ����
		}
	}

}
