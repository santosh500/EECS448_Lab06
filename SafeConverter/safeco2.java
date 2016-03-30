package safeco;

import javax.swing.*;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.ButtonGroup;

public class safeco2 implements ActionListener{
	
	String g="";
	JPanel content;
	JButton button;
	JLabel label;
	JTextField t;
	ButtonGroup temps;
	JRadioButton fc;
	JRadioButton fk;
	JRadioButton ck;
	JRadioButton cf;
	JRadioButton kf;
	JRadioButton kc;
	int o=0;
	int k=0;
	//Random dice=new Random();

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		g=t.getText();
		if(g.isEmpty() || !intcheck(g))
		{
			//System.out.println("give a valid number");
			if(g.isEmpty())
			{
				label.setText("Please give a value");
			}
			else if(!intcheck(g))
			{
				label.setText("Please make give a number (integer)");
			}
			
		}
		else
		{
			
			if(fc.isSelected())
			{
				double v=Integer.parseInt(g); 
				v=(v-32)*1.8;
				label.setText("F to C: " + v + " Celsius");
				
			}
			else if(fk.isSelected())
			{
				
				double v=Integer.parseInt(g); 
				v=(v+459.67)*(1.8);
				label.setText("F to K: " + v + " Kelvin");
			}
			else if(ck.isSelected())
			{
				
				double v=Integer.parseInt(g); 
				v=v + 273.15;
				label.setText("C to K: " + v + " Kelvin");
			}
			else if(cf.isSelected())
			{
				
				double v=Integer.parseInt(g); 
				v=v*(1.8)+32;
				label.setText("C to F: " + v + " Farenheit");
			}
			else if(kf.isSelected())
			{
				
				double v=Integer.parseInt(g); 
				v=v*(1.8)-459.67;
				label.setText("K to F: " + v + " Farenheit");
			}
			else if(kc.isSelected())
			{
				
				double v=Integer.parseInt(g); 
				v=(v) - 273.15;
				label.setText("K to C: " + v + " Celsius");
			}
		}
	
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
	
	public Component getContent()
	{
		return(content);
	}
	
	public safeco2()
	{
		content = new JPanel(new GridLayout(20,20));
		button = new JButton("Submit");
		label = new JLabel("Please enter a value that is a number");
		temps = new ButtonGroup();
		fc=new JRadioButton("F to C");
		fk=new JRadioButton("F to K");
		ck=new JRadioButton("C to K");
		cf=new JRadioButton("C to F");
		kf=new JRadioButton("K to F");
		kc=new JRadioButton("K to C");
		t=new JTextField(null,20);
		button.addActionListener(this);
		content.add(button);
		content.add(label);
		content.add(fc);
		content.add(fk);
		content.add(ck);
		content.add(cf);
		content.add(kf);
		content.add(kc);
		temps.add(fc);
		temps.add(fk);
		temps.add(ck);
		temps.add(cf);
		temps.add(kf);
		temps.add(kc);
		content.add(t);
	}

}
