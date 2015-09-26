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
	private JTextField textField; // 定义文本框
	private String lastCommand = "=";// 最后一次单机的控制符
	private double result = 0;// 保存计算结果
	private boolean start = true;// 是否开始计算
	private int isNegative = 0;// 统计正负号点击次数

	public void draw()// 绘制计算器的界面
	{
		JFrame frame = new JFrame("计算器");

		// 定义面板，并设置为网格布局，4行4列，组件水平、垂直间距均为3
		JPanel panel = new JPanel(new GridLayout(5, 4, 3, 3));
		JPanel panel2 = new JPanel(new GridLayout(1, 1));

		// 将文本框放置在窗体NORTH位置
		frame.getContentPane().add(panel2, BorderLayout.NORTH);
		// 将面板放置在窗体CENTER位置
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		textField = new JTextField(); // 定义文本框
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		panel2.add(textField);

		// 定义字符串数组，为按钮的显示文本赋值
		// 注意字符元素的顺序与循环添加按钮保持一致
		String[] str = { "", "±", "Back", "Clear", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".",
				"=", "+" };
		JButton[] btn = new JButton[str.length];
		for (int i = 0; i < str.length; i++)
		{
			btn[i] = new JButton(str[i]);
			btn[i].setFont(new Font("微软雅黑", Font.PLAIN, 15));
			panel.add(btn[i]);
			btn[i].addActionListener(this);
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)// 单机按钮的监听方法
	{
		List<String> command = new ArrayList<String>();// 控制符集合
		command.add("+");
		command.add("-");
		command.add("*");
		command.add("/");
		command.add("=");
		command.add("±");

		List<String> operation = new ArrayList<String>();// 功能集合
		operation.add("Back");
		operation.add("Clear");

		String value = e.getActionCommand();// 当前单机按钮的值
		String text = textField.getText();// 文本框的值
		System.out.println(value);

		if (command.contains(value))
		{
			if ("±".equals(value)) // 正负号
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
				textField.setText("除数不能为零");
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
