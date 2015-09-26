package com.lcafe8;

public class GrayCodeTest
{
	/*
	 *��һ�������� 0, 1 �����ַ�����
	 *�ڶ������ڵ�һ���Ļ����ϣ�ÿһ���ַ���������0��1������ÿ��ֻ�ܼ�һ�������Ե������Ρ�
	 *�����ͱ���� 00,01,11,10 ��ע��Գƣ���
	 *���������ڵڶ����Ļ����ϣ��ٸ�ÿ���ַ���������0��1��
	 *ͬ����ÿ��ֻ�ܼ�һ���������ͱ���� 000,001,011,010,110,111,101,100��
	 *���ˣ������Ͱ�3λԪ���������ɺ��ˡ�
	 *���Ҫ����4λԪ�����룬����ֻ��Ҫ��3λԪ���������ټ�һ��0,1
	 *�Ϳ����ˣ� 0000,0001,0011,0010,0110,0111,0101,0100,1100,1101,
	 *1110,1010,0111,1001,1000.
	 */
	public String[] GrayCode(int n)
	{
			// nλԪ�������ǻ���n-1λԪ����������ġ�
			String[] graycode = new String[(int) Math.pow(2, n)];

			if (n == 1)
			{
				graycode[0] = "0";
				graycode[1] = "1";
				return graycode;
			}

			String[] last = GrayCode(n - 1);

			for (int i = 0; i < last.length; i++)
			{
				graycode[i] = "0" + last[i];
				graycode[graycode.length - 1 - i] = "1" + last[i];
			}

			return graycode;
	}

	public static void main(String[] args)
	{
			String[] arr = new GrayCodeTest().GrayCode(1);
			for (String element : arr)
			{
				System.out.print(element + " ");
			}
	}
}
