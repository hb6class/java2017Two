package com.hb.day23;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		
		CardLayout card=new CardLayout();
		Panel p=new Panel(card);
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		p1.setBackground(new Color(255,0,0));
		p2.setBackground(new Color(0,255,0));
		p3.setBackground(new Color(0,0,255));
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		f.add(p);
		f.setBounds(1600,0,300,500);
		f.setVisible(true);
		card.previous(p);
		card.previous(p);
		card.previous(p);
	}

}
