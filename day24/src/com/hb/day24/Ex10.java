package com.hb.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.Arrays;

public class Ex10 extends Frame {
	public Ex10() {
		
		Button[] btns=new Button[6];
//		Arrays.fill(btns, new Button());
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(i+"");
		}
		
		Panel p=new Panel(new GridLayout(1,2));
		
		Panel p1=new Panel(new GridLayout(2,1));
		Panel p1_1=new Panel(new GridLayout(1,2));
		Panel p1_2=new Panel(new GridLayout(1,1));
		p1.add(p1_1);
		p1.add(p1_2);
		Panel p2=new Panel(new GridLayout(1,2));
		Panel p2_1=new Panel(new GridLayout(2,1));
		Panel p2_2=new Panel(new GridLayout(1,1));
		p2.add(p2_1);
		p2.add(p2_2);
		p.add(p1);
		p.add(p2);
		
		p1_1.add(btns[0]);
		p1_1.add(btns[1]);
		p1_2.add(btns[2]);
		p2_1.add(btns[3]);
		p2_1.add(btns[4]);
		p2_2.add(btns[5]);
		
		add(p);
		setBounds(1600, 0, 600, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  Ex10();
	}

}
