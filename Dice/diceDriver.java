
import javax.swing.*;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;
public class diceDriver {
	
	public static void main(String[] args)
	{
		roll_dice();
		
	}
	
	private static void roll_dice()
	{
		JFrame frame=new JFrame("Dice");
		diceClass a=new diceClass();
		frame.getContentPane().add(a.content);
		frame.pack();
		frame.setVisible(true);
		
	}

}