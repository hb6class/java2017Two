package com.hb.day25;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


public class Ex15 extends Frame {
	class MyCanvas extends Canvas{
		
		@Override
		public void paint(Graphics g) {
			Color c=new Color(255,0,0);
			g.setColor(c);
//		g.drawLine(0, 200, 400, 200);
//		g.drawRect(100, 100, 200, 100);
//		g.fillRect(100, 100, 200, 100);
//		g.drawOval(0,0, 200,100);
//		g.fillOval(0,0, 200,100);
//		g.fillArc(100, 100, 200, 100, 100, 100);
//		g.draw3DRect(100, 100, 200, 100,true);
			java.awt.Toolkit kit=Toolkit.getDefaultToolkit();
			
			Image img = kit.getImage("google.png");
			
			g.drawImage(img, 100, 100, this);
		}
	}
	
	public Ex15() {
		
		MyCanvas can=new MyCanvas();
		add(can);
		
		setBounds(1600, 0, 500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex15();
	}

}
