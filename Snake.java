package com.jdbc;

import javax.swing.*;

public class Snake extends JFrame

{
	Snake()
	{
		super("Snake Game");
		add(new Board());
		pack();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setLocationRelativeTo(null);
		setResizable(false);
		
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() -> 
		{
		new Snake().setVisible(true);
		

		});

}
}
