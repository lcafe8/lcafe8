package com.lcafe8.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridTest
{
	private Frame frame;
	private Button button1,button2,button3,button4,button5,button6;
	
	public void go()
	{
		frame = new Frame("Grid Layout");
		
		frame.setLayout(new GridLayout(3,2));
		
		button1 = new Button("button1");
		button2 = new Button("button2");
		button3 = new Button("button3");
		button4 = new Button("button4");
		button5 = new Button("button5");
		button6 = new Button("button6");
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		GridTest gridTest = new GridTest();
		gridTest.go();
	}
}
