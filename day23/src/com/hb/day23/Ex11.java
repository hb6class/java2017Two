package com.hb.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		
//		f.setLayout(null);
//		Button btn1=new Button("btn1");
//		btn1.setSize(100, 50);
//		btn1.setLocation(100, 50);
//		f.add(btn1);
		
		Panel p=new Panel(null);
		
		Button btn1=new Button("btn1");
		btn1.setSize(100, 50);
		btn1.setLocation(100, 50);
		btn1.setEnabled(false);
		
		p.add(btn1);
		f.add(p);
		f.setBounds(1600,0,500,300);
		f.setVisible(true);
		f.setResizable(false);
	}

}












