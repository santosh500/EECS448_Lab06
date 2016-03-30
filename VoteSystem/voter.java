package votesys;

import static java.lang.System.out;

import javax.swing.*;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

import static java.lang.System.*;

public class voter implements ActionListener
{
	
	String g="";
	JPanel content;
	JButton button;
	JLabel label;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JTextField t;
	JTextField fn;
	JTextField ln;
	JRadioButton trump;
	JRadioButton kasich;
	JRadioButton clinton;
	JRadioButton sanders;
	ButtonGroup nominees;
	int o=0;
	int k=0;
	String u="";
	String p="";
	String y="";
	
	
	public void actionPerformed(ActionEvent q) 
	{
		
		// TODO Auto-generated method stub
		if(!checkVote())
		{
			
		}
		u=choice();
		p=ln.getText();
		y=fn.getText();
		String v=p+"_"+y+"_ballot.txt";
		String w="";
		if(!checkVote())
		{
			label2.setText("Please Select a Candidate");
		}
		else
		{
			try
			{
				FileReader fr = new FileReader(v);
				BufferedReader br = new BufferedReader(fr);
				String str="";
				
				str=br.readLine();
				w=p+" "+y;
				if(str.equals(w))
				{
					label2.setText("This Person has Already Voted");
				}
				/*
				BufferedReader br = new BufferedReader(fr);
				String str="";
				
				str=br.readLine();
				out.println(str);
				
				
				v8=g+" "+t;
				System.out.println(v);
				
				if(str.equals(v))
				{
					System.out.println("Hi guys");
				}
				else
				{
					System.out.println("episode1");
				}
				
				/*
				while((str=br.readLine()) != null)
				{
					out.println(str + "\n");
				}*/
			}
			catch(IOException e)
			{
				label2.setText("Thank You for Casting Your Vote");
				try
				{
					
					FileWriter fw = new FileWriter(v);
					PrintWriter pw=new PrintWriter(fw);
					
					pw.println(p + " " + y);
					pw.println("Vote casted for: " + u);
							
					pw.close();
				}
				catch(IOException ve)
				{
					out.println("ERROR!");
				}
			}
		}
		
		
		
		//label2.setText(u);
		//System.out.println(u);
		
	}
	
	public boolean checkVote()
	{
		if(nominees.getSelection()==null)
		{
			return false;
		}
		return true;
	}
	
	public String choice()
	{
		if(trump.isSelected())
		{
			g="Donald Trump";
		}
		else if(kasich.isSelected())
		{
			g="John Kasich";
		}
		else if(clinton.isSelected())
		{
			g="Hilary Clinton";
		}
		else if(sanders.isSelected())
		{
			g="Bernie Sanders";
		}
		
		return g;
	}
	
	public voter()
	{
		content = new JPanel(new GridLayout(20,20));
		button = new JButton("Submit");
		label = new JLabel("Please give a vote. \n Only one vote per person.");
		label2 = new JLabel("");
		trump=new JRadioButton("Donald Trump");
		kasich=new JRadioButton("John Kasich");
		clinton=new JRadioButton("Hillary Clinton");
		sanders=new JRadioButton("Bernie Sanders");
		nominees = new ButtonGroup();
		label3 = new JLabel("Please give last name");
		ln=new JTextField("",20);
		label4 = new JLabel("Please give first name");
		fn=new JTextField("",20);
		
		button.addActionListener(this);
		
		content.add(label);
		content.add(trump);
		content.add(kasich);
		content.add(clinton);
		content.add(sanders);
		nominees.add(trump);
		nominees.add(kasich);
		nominees.add(clinton);
		nominees.add(sanders);
		content.add(label3);
		content.add(ln);
		content.add(label4);
		content.add(fn);
		content.add(button);
		content.add(label2);
		
		
		
	}
}
