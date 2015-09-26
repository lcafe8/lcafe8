package com.lcafe8.innerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("SwingTest");

		JButton button = new JButton("click me");

		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Welcome");
			}
		});

		frame.setSize(200, 200);

		frame.getContentPane().add(button);

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
