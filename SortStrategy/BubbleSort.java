package com.lcafe8.sortStrategy;

/**
 * ð������
 * @author Administrator
 *
 */
public class BubbleSort implements InterfaceSort
{
	public void Sort(int[] arr)
	{
		boolean isChange = true;
		for (int j = arr.length - 1; isChange = true && j > 0; j--)
		{
			for (int i = 0; i < j; i++)
			{
				if (arr[i] > arr[i + 1])
				{
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				} 
				else
				{
					isChange = false;
				}
			}
			System.out.print("��" + (arr.length-j) + "��: ");
			for(int element: arr)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
