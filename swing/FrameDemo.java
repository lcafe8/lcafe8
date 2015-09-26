package com.lcafe8.swing;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameDemo
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("FrameDemo");

		JButton button = new JButton("button1");

		JLabel label = new JLabel("hello world");

		frame.addWindowListener(new MyWindowListener());
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.getContentPane().add(button, BorderLayout.NORTH);

		frame.pack();

		frame.setVisible(true);
	}
}

class MyWindowListener extends WindowAdapter
{
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.out.println("¹Ø±Õ´°¿Ú");
		System.exit(0);
	}
}