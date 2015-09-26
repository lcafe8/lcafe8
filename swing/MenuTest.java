package com.lcafe8.swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTest
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("MenuTest");

		JMenuBar menuBar = new JMenuBar();

		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Sava");
		JMenu menu3 = new JMenu("Load");
		JMenu menu4 = new JMenu("Quite");

		JMenuItem item1 = new JMenuItem("New");
		JMenuItem item2 = new JMenuItem("hello");
		JMenuItem item3 = new JMenuItem("world");
		JMenuItem item4 = new JMenuItem("zhangsan");

		frame.setJMenuBar(menuBar);

		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);

		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);

		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
