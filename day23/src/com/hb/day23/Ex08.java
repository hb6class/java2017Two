package com.hb.day23;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		Panel p = new Panel();
		
		Label la1 = new Label();
		la1.setText("°¡³ª´Ù¶ó¸¶¹Ù»ç");
		la1.setAlignment(Label.LEFT);
		Color color = new Color(255,200,200);//»¡,³ì,ÆÄ(0~255)
		la1.setBackground(color);
		Font font=new Font("±¼¸²Ã¼", Font.BOLD, 20);
		la1.setFont(font);
		
		p.add(la1);
		
		TextField tf=new TextField(10);
		tf.setFont(font);
		p.add(tf);
		f.add(p);
		f.setBounds(1600,0,500,300);
		f.setVisible(true);
	}

}
