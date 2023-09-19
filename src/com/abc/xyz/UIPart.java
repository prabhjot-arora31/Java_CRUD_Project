package com.abc.xyz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class UIPart extends Frame {
	static String nm,em,cty;
	 static Label lb;
	static int age2;
	UIPart(String s){
		super(s);
		Frame obj = new Frame();
		setLayout(new GridBagLayout());
		Button addData = new Button("Submit");
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
		JPanel jpanel = new JPanel();
		jpanel.add(new Label("Enter Name:"));
		TextField name = new TextField(20);
		jpanel.add(name);
		add(jpanel);
		JPanel jpanel2 = new JPanel();
		jpanel.add(new Label("Enter Email:"));
		TextField email = new TextField(20);
		jpanel.add(email);
		add(jpanel2);
		JPanel jpanel3 = new JPanel();
		jpanel.add(new Label("Enter City:"));
		TextField city = new TextField(20);
		jpanel.add(city);
		add(jpanel3);
		JPanel jpanel4 = new JPanel();
		jpanel.add(new Label("Enter Age:"));
		TextField age = new TextField(20);
		jpanel.add(age);
		add(jpanel4);
		add(addData);
		lb = new Label();
		lb.setSize(3,30);
		add(lb);
		addData.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 nm = name.getText();
				 em = email.getText();
				 cty = city.getText();
				 age2 = Integer.parseInt(age.getText());
				 System.out.println(nm);
				 System.out.println(em);
				 System.out.println(cty);
				 InsertionOfData.startIt();
			}
		});
	}
	public static String returnName() {
		return nm;
	}
	public static int returnAge() {
		return age2;
	}
	public static String returnCity() {
		return cty;
	}
	public static String returnEmail() {
		return em;
	}
}
