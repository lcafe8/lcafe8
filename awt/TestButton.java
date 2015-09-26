package com.lcafe8.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("Test Button");

		Button button = new Button("Press Me");

		frame.add(button, BorderLayout.CENTER);

		button.addActionListener(new ButtonHandler());
		//Button增加事件处理器
		
		frame.setSize(200, 200);
		//frame.pack();
		frame.setVisible(true);
	}
}

class ButtonHandler implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
		
		System.out.println("Button is Pressed!");
	}
}