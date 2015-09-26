package com.lcafe8.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class ExGui3
{
	private Frame frame;
	private Button button1, button2, button3, button4;

	public void go()
	{
		frame = new Frame("Complex Layout");

		button1 = new Button("West");
		button2 = new Button("Center");

		frame.add(button1, BorderLayout.WEST);
		frame.add(button2, BorderLayout.CENTER);

		Panel panel = new Panel();

		button3 = new Button("Hello");
		button4 = new Button("World");

		panel.add(button3);
		panel.add(button4);

		frame.add(panel, BorderLayout.NORTH);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	public static void main(String[] args)
	{
		ExGui3 exGui3 = new ExGui3();
		exGui3.go();
	}
}
