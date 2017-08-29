package com.hb.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex01 implements ActionListener {

	public static void main(String[] args) {
		// ActionListener
		Frame f= new Frame();
		
		Panel p= new Panel();
		
		Button btn1=new Button("버튼1");
		Ex01 me = new Ex01();
		p.add(btn1);
		TextField tf=new TextField(20);
		p.add(tf);
		tf.addActionListener(me);
		f.add(p);
		f.setBounds(1600,0,400,300);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("이벤트 발생");
	}

}
