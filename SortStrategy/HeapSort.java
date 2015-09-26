package com.lcafe8.SortStrategy;
/**
 * 堆排序
 * @author Administrator
 * @date 2015年9月3日
 */
public class HeapSort implements InterfaceSort
{
	public void Sort(int[] arr)
	{
		HeapSort h = new HeapSort();
		h.HeapBuild(arr);
		// 从最后一个元素开始对序列进行调整
		for (int i = arr.length - 1; i > 0; --i)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			h.HeapAdjuest(arr, 0, i);
			System.out.print("第" + (arr.length - i) + "趟： ");
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
		System.out.print("初始堆： ");
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
			if (child + 1 < length && arr[child + 1] > arr[child]) // 如果有右孩子，比较左孩子和右孩子大小。
			{
				++child;
			}
			if (arr[child] > arr[i])
			{
				arr[i] = arr[child];// 将当前节点换成左孩子或右孩子
				i = child;
				child = 2 * i + 1;// 将当前移动孩子的节点作为下一个待调整节点
			} else
			{
				break;
			}
			arr[i] = temp;// 当前待调整的结点放到比其小的孩子结点位置上
		}
	}

}
