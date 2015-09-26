package com.lcafe8.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest
{
	private Frame frame;
	private Button button1, button2, button3, button4;

	public void go()
	{
		frame = new Frame("Flow Layout");

		frame.setLayout(new FlowLayout());

		button1 = new Button("hello");
		button2 = new Button("world");
		button3 = new Button("welcome");
		button4 = new Button("sdust");
		
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);

		frame.setSize(100, 100);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		FlowTest flowTest = new FlowTest();
		flowTest.go();
	}
	
}
