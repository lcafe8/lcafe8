package com.lcafe8.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

public class MyFrame
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("My Frame");

		Button button = new Button("Press Me");
		
		button.addActionListener(new MyListener());
		button.addActionListener(new MyListener1());
		
		frame.addWindowListener(new MyWindowListener());
		
		frame.add(button);

		frame.pack();
		frame.setVisible(true);
	}
}

class MyListener implements ActionListener
{
	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e)
	{
		long date = e.getWhen();
		Date date2 = new Date(date);
		System.out.println(date2.toLocaleString());
	}
}

class MyListener1 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("测试结果，有没有！");
	}
}

class MyWindowListener implements WindowListener
{

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.out.println("关闭窗口");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}
}