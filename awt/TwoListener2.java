package com.lcafe8.awt;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TwoListener2 implements MouseMotionListener, MouseListener
{
	private Frame frame;

	private TextField textField;

	public void go()
	{
		frame = new Frame("Two Listener Example");

		frame.add(new Label("Click"), BorderLayout.NORTH);

		textField = new TextField(30);

		frame.add(textField, BorderLayout.SOUTH);

		frame.addMouseMotionListener(this);
		frame.addMouseListener(this);
		frame.addMouseListener(new MyAdapter());

		frame.setSize(300, 300);

		frame.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		String str = "The mouse has left the Frame";
		this.textField.setText(str);
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		String str = "X: " + e.getX() + ",Y: " + e.getY();
		this.textField.setText(str);
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	public static void main(String[] args)
	{
		TwoListener two = new TwoListener();

		two.go();
	}
}

class MyAdapter extends MouseAdapter
{
	@Override
	public void mouseEntered(MouseEvent e)
	{
		String str = "The mouse entered the frame";
		System.out.println(str);
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		String str = "The mouse exited the frame";
		System.out.println(str);
	}
}
