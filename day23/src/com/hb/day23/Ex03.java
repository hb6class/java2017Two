package com.hb.day23;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		Panel p = new Panel();
//		Checkbox chb1=new Checkbox("야구");
//		Checkbox chb2=new Checkbox("농구",true);
//		Checkbox chb3=new Checkbox("배구",true);
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox chb1=new Checkbox("java",cbg,false);
		Checkbox chb2=new Checkbox("web",cbg,true);
		Checkbox chb3=new Checkbox("framework",cbg,false);
		
//		chb1.setLabel("자바");
//		chb2.setLabel("웹");
//		chb3.setLabel("프레임워크");
//		chb2.setState(true);
		
		p.add(chb1);
		p.add(chb2);
		p.add(chb3);
		f.add(p);
		f.setSize(400, 300);
		f.setLocation(1600,0);
		f.setVisible(true);
		
		System.out.println(chb1.getState());
	}

}
