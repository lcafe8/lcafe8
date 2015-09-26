package com.lcafe8.Calculation;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MyCalculate implements ActionListener
{
	private JTextField textField; // �����ı���
	private String lastCommand = "=";// ���һ�ε����Ŀ��Ʒ�
	private double result = 0;// ���������
	private boolean start = true;// �Ƿ�ʼ����
	private int isNegative = 0;// ͳ�������ŵ������

	public void draw()// ���Ƽ������Ľ���
	{
		JFrame frame = new JFrame("������");

		// ������壬������Ϊ���񲼾֣�4��4�У����ˮƽ����ֱ����Ϊ3
		JPanel panel = new JPanel(new GridLayout(5, 4, 3, 3));
		JPanel panel2 = new JPanel(new GridLayout(1, 1));

		// ���ı�������ڴ���NORTHλ��
		frame.getContentPane().add(panel2, BorderLayout.NORTH);
		// ���������ڴ���CENTERλ��
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		textField = new JTextField(); // �����ı���
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setFont(new Font("΢���ź�", Font.PLAIN, 15));
		panel2.add(textField);

		// �����ַ������飬Ϊ��ť����ʾ�ı���ֵ
		// ע���ַ�Ԫ�ص�˳����ѭ����Ӱ�ť����һ��
		String[] str = { "", "��", "Back", "Clear", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".",
				"=", "+" };
		JButton[] btn = new JButton[str.length];
		for (int i = 0; i < str.length; i++)
		{
			btn[i] = new JButton(str[i]);
			btn[i].setFont(new Font("΢���ź�", Font.PLAIN, 15));
			panel.add(btn[i]);
			btn[i].addActionListener(this);
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)// ������ť�ļ�������
	{
		List<String> command = new ArrayList<String>();// ���Ʒ�����
		command.add("+");
		command.add("-");
		command.add("*");
		command.add("/");
		command.add("=");
		command.add("��");

		List<String> operation = new ArrayList<String>();// ���ܼ���
		operation.add("Back");
		operation.add("Clear");

		String value = e.getActionCommand();// ��ǰ������ť��ֵ
		String text = textField.getText();// �ı����ֵ
		System.out.println(value);

		if (command.contains(value))
		{
			if ("��".equals(value)) // ������
			{
				isNegative++;
				if (isNegative % 2 != 0)
				{
					textField.setText("-" + text);
				} else
				{
					textField.setText(text.substring(1, text.length()));
				}
			} else
			{
				calculate(Double.parseDouble(textField.getText()));
				lastCommand = value;
				start = true;
			}
		} else if (operation.contains(value))
		{
			if ("Clear".equals(value))
			{
				textField.setText("0");
				lastCommand = "=";
				start = true;
				isNegative = 0;
				result = 0;
			}
			if ("Back".equals(value))
			{
				if (text.length() > 1)
				{
					textField.setText(text.substring(0, text.length() - 1));
				} else
				{
					textField.setText("0");
				}
			}
		} else
		{
			if (start)
			{
				textField.setText("");
				start = false;
			}
			if (text.contains(".") && ".".equals(value))
			{
				return;
			}
			if (text.startsWith("-0.") || text.startsWith("0."))
			{
				textField.setText(textField.getText() + value);
			} else if (text.startsWith("0"))
			{
				if (".".equals(value))
				{
					textField.setText(text + value);
				} else
				{
					textField.setText(value);
				}
			} else
			{
				textField.setText(textField.getText() + value);
			}
		}
	}

	public void calculate(double x)
	{
		char operator = lastCommand.charAt(0);
		switch (operator)
		{
		case '+':
			result += x;
			break;
		case '-':
			result -= x;
			break;
		case '*':
			result *= x;
			break;
		case '/':
			if ("0".equals(textField.getText()))
			{
				textField.setText("��������Ϊ��");
				start = true;
				lastCommand = "=";
				result = 0;
				return;
			} else
			{
				result /= x;
				break;
			}
		case '=':
			result = x;
			//calculate(Double.parseDouble(textField.getText()));
			break;
		}
		textField.setText("" + result);
	}

	public static void main(String[] args)
	{
		MyCalculate myCalculate = new MyCalculate();
		myCalculate.draw();
	}
}
