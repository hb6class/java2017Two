package com.hb.day26;

import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ex04 extends Frame implements Runnable{
	TextField tf1,tf2;
	public Ex04() {
		Font f=new Font("»õ±¼¸²",Font.BOLD,22);
		Panel p = new Panel(new GridLayout(2,2));
		Label la1=new Label("thr1");
		Label la2=new Label("thr2");
		tf1=new TextField(10);
		tf2=new TextField(10);
		
		la1.setFont(f);
		la2.setFont(f);
		tf1.setFont(f);
		tf2.setFont(f);
		
		p.add(la1);
		p.add(tf1);
		p.add(la2);
		p.add(tf2);
		
		add(p);
		setBounds(1600, 0, 500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 me = new  Ex04();
		Thread thr1=new Thread(me,"thr1");
		Thread thr2=new Thread(me,"thr2");
		
		thr1.start();
		thr2.start();
	}

	@Override
	public void run() {
		for(int i=0; i<20; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
//		if(Thread.currentThread().getName().equals("thr1")){
//			for(int i=0; i<20; i++){
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				tf1.setText(i+"");
//			}
//		}else{
//			for(int i=0; i<20; i++){
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				tf2.setText(i+"");				
//			}
//		}
	}

}
