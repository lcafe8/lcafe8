package com.lcafe8.exam;

import java.util.regex.Pattern;

public class DigitalToUpper
{
	// �ж�������ַ����Ƿ�ȶ�������
	public static boolean isDigital(String str)
	{
		if (str.length() == 0)
		{
			System.out.println("������ַ���Ϊ�գ��޷�ת����");
			return false;
		}
		if (str.length() > 8)
		{
			System.out.println("������ַ������ȳ���8�����������룡");
			return false;
		}

		Pattern pattern = Pattern.compile("[0-9]*");
		boolean flag = pattern.matcher(str).matches();
		if (flag)
		{
			return true;
		} else
		{
			System.out.println("�ַ�����" + str + "���д��ڷ������ַ����޷�ת����");
			return false;
		}
	}

	public static String ToUpperCase(String str)
	{
		String result = "";
		char[] inDigit = { 'ʮ', '��', 'ǧ' };
		char[] digit = { '��', '��' };
		char[] upper = { '��', 'һ', '��', '��', '��', '��', '��', '��', '��', '��' };

		int value = Integer.parseInt(str);// ��ʽ������
		str = String.valueOf(value);
		char[] digital = str.toCharArray();
		int zeroCount = 0;// ��¼�������ּ�����
		boolean flag = false;// �ж����Ƿ�д����

		for (int i = 0; i < digital.length; i++)
		{
			int indix = (digital.length - i - 1) % 4;
			int dix = (digital.length - i - 1) / 4;

			if ('0' == digital[i])
			{
				if (indix > 0)
				{
					flag = true;
				}
				if (indix == 0 && dix > 0)
				{
					result += digit[dix - 1];
				}
				zeroCount++;
			} else
			{
				boolean dflag = false;
				if(zeroCount > 0)
				{
					dflag = true;
				}
				zeroCount = 0;
				if (flag == true)
				{
					result += upper[0];
					flag = false;
				}
				if (dflag && '1' == digital[i] && 1 == indix)
				{

				} else
				{
					result += upper[digital[i] - '0'];
				}

				if (indix > 0)
				{
					result += inDigit[indix - 1];
				}
				if (indix == 0 && dix > 0)
				{
					result += digit[dix - 1];
				}

			}
		}

		return result;
	}

	public static void main(String[] args)
	{
		String[] str = { "1234567", "0001", "1001", "1100", "10100", "0010"
				, "00000001", "10000001", "10000010","10000100", "11000000"
				, "10100000", "10010000", "10001000","10101010", "11100010"
				, "10101011", "a00045", "a" };
		for (String string : str)
		{
			if (DigitalToUpper.isDigital(string))
				System.out.println(string + ": " + DigitalToUpper.ToUpperCase(string));
		}
	}

}
