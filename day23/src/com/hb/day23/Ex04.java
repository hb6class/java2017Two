package com.hb.day23;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		Panel p = new Panel();
		
		Choice choi=new Choice();
//		choi.addItem("java");
//		choi.addItem("web");
//		choi.addItem("framework");
//		choi.addItem("web");
//		
////		choi.select("web");
//		choi.remove("web");
		Date d=new Date();
		int year=d.getYear()+1900;
		
		for(int i=year-5; i<year+5; i++){
			choi.addItem(i+"");
		}
		choi.select(year+"");
		
		
		p.add(choi);
		f.add(p);
		f.setBounds(1600, 0, 300, 200);
		f.setVisible(true);
		
	}

}
