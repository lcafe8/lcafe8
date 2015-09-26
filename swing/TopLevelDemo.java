package com.lcafe8.swing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class TopLevelDemo
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("TopLevelDemo");
		
		frame.addWindowListener(new MyWindowListener());
		
		JLabel label = new JLabel("hello,world");
		
		label.setBackground(Color.YELLOW);
		label.setPreferredSize(new Dimension(200,180));
		
		JMenuBar menuBar = new JMenuBar();
		
		menuBar.setBackground(Color.CYAN);
		menuBar.setPreferredSize(new Dimension(200,20));
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(label);
		
		frame.pack();
		frame.setVisible(true);
	}
}
