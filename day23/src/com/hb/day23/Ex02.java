package com.hb.day23;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex02 extends Frame{
	
	public Ex02() {
		super("제목3");
		
//		this.setTitle("제목2");
		
		FlowLayout fl = new FlowLayout();
		Panel pMain=new Panel(fl);
		
		Label la1=new Label();
		la1.setText("아 이 디:");
		Label la2=new Label();
		la2.setText("패스워드:");
		
//		TextField tf= new TextField("id입력란",10);
		TextField tf= new TextField();
		tf.setColumns(20);
//		tf.setText("pw입력란");
		TextField tf2= new TextField();
		tf2.setColumns(20);
		tf2.setEchoChar('*');
		
		TextArea ta= new TextArea("abcdef",5,20,3);
//		TextArea ta= new TextArea();
//		ta.setColumns(30);
//		ta.setRows(5);
//		ta.setText("내용입력");
		
		pMain.add(la1);
		pMain.add(tf);
		pMain.add(la2);
		pMain.add(tf2);
		pMain.add(ta);
		
		this.add(pMain);
		init();
	}
	void init(){
		setSize(300,400);
		setLocation(1600,100);
		setVisible(true);	
		pack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}

}
