package com.hb.day24;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex16 extends Frame implements ItemListener{
	Checkbox chk1,chk2,chk3;
	public Ex16() {
		
		Panel p = new Panel();
		
		chk1=new Checkbox("item1");
		chk2=new Checkbox("item2");
		chk3=new Checkbox("item3");
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		
		p.add(chk1);
		p.add(chk2);
		p.add(chk3);
		
		
		this.add(p);
		this.setBounds(1600, 0, 500, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex16();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(chk1.getState()){
			System.out.println("item1Ã¼Å©µÊ");
		}else{
			System.out.println("item1Ã¼Å©ÇØÁ¦µÊ");			
		}
		if(chk2.getState()){
			System.out.println("item2Ã¼Å©µÊ");
		}else{
			System.out.println("item2Ã¼Å©ÇØÁ¦µÊ");			
		}
		if(chk3.getState()){
			System.out.println("item3Ã¼Å©µÊ");
		}else{
			System.out.println("item3Ã¼Å©ÇØÁ¦µÊ");			
		}
	}

}
