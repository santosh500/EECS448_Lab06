package safeco;

import javax.swing.*;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;



public class safedriver {
	
	public static void main(String[] args)
	{
		run_safeco();
		
	}
	
	private static void run_safeco()
	{
		JFrame frame=new JFrame("Safe Converter");
		safeco2 a=new safeco2();
		frame.getContentPane().add(a.content);
		frame.pack();
		frame.setVisible(true);
		
	}

}
