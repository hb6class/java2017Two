package com.hb.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex14 extends MouseAdapter{
	
	@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Å¬¸¯");
		}
	
//	@Override
//	public void mouseDragged(MouseEvent e) {
//		// TODO Auto-generated method stub
//		super.mouseDragged(e);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f= new Frame();
		
		Panel p = new Panel();
		Button btn = new  Button("*");
		btn.addMouseListener(new Ex14());
		p.add(btn);
		f.add(p);
		f.setBounds(1600, 0, 500, 300);
		f.setVisible(true);
	}

}
