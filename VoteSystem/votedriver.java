package votesys;

import javax.swing.*;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;


public class votedriver {
	
	public static void main(String[] args)
	{
		run_voter();
	}
	
	private static void run_voter()
	{
		JFrame frame=new JFrame("Vote System");
		voter a=new voter();
		frame.getContentPane().add(a.content);
		frame.pack();
		frame.setVisible(true);
		
	}

}