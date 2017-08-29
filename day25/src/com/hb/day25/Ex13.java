package com.hb.day25;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex13 extends Frame{
	
	public Ex13() {
		
		Toolkit kit = java.awt.Toolkit.getDefaultToolkit();
		Dimension scn = kit.getScreenSize();
		
//		System.out.println(scn.getWidth()+":"+scn.getHeight());
		int w=(int)scn.getWidth();
		int h=(int)scn.getHeight();
		
		
		Dimension dim=new Dimension(200,200);
//		Dimension dim=new Dimension();
//		dim.setSize(300, 300);
		this.setSize(dim);
		
		w=w/2-getWidth()/2;
		h=h/2-getHeight()/2;
		this.setLocation(w+1600, h);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex13();
	}

}
