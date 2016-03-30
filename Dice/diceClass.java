import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class diceClass implements ActionListener
{
	String g="";
	JPanel content;
	JButton button;
	JLabel label;
	JLabel label2;
	JTextField t;
	int o=0;
	int k=0;
	Random dice=new Random();

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		g=t.getText();
		if(!intcheck(g))
		{
			
			label2.setText("Please make give a number (integer)");
			
			
		}
		else
		{
			
			o= Integer.parseInt(g); 
			k=dice.nextInt(o);
			k=k+1;
			label2.setText("You Rolled a: " + String.valueOf(k));
		}
		
	}
	
	
	
	public Component getContent()
	{
		return(content);
	}
	public boolean intcheck(String v)
	{
		try
		{
			Integer.parseInt(v);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		catch(NullPointerException e) {
	        return false;
	    }
		return true;
	}
	public diceClass()
	{
		content = new JPanel(new GridLayout(5,5));
		button = new JButton("Roll");
		label = new JLabel("Enter a number and Click to Roll the Dice");
		label2 = new JLabel("");
		t=new JTextField(null,20);
		button.addActionListener(this);
		content.add(label);
		content.add(t);
		content.add(button);
		content.add(label2);
	}
}
