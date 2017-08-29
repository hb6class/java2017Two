package com.hb.day25;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex16 extends Frame {
	
	public Ex16() {
		Panel p =new Panel(new GridLayout(2,1));
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		Image image=kit.getImage("google.png");
		Icon icon=new ImageIcon(image);
		JButton btn1=new JButton(icon);
		p.add(btn1);
		
		image=kit.getImage("daum.png");
		icon=new ImageIcon(image);
		JButton btn2=new JButton(icon);
		p.add(btn2);
		
		add(p);
		setBounds(1600, 0, 300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex16();
	}

}
