package com.hb.day25;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex14 extends Frame implements Runnable{
	Panel p;
	Button[] btns;
	String[] msg={
			"1","2","3"
			,"4","5","6"
			,"7","8","9"
	};

	public Ex14() {

		p=new Panel(new GridLayout(3,3));
		
		btns=new Button[9];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(msg[i]);
			p.add(btns[i]);
		}
		
		this.add(p);
		this.setBounds(1600, 0, 300, 300);
		this.setVisible(true);
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String tmp=msg[0];
			for(int i=1; i<msg.length; i++){
				msg[i-1]=msg[i];
			}
			msg[msg.length-1]=tmp;
			
			for(int i=0; i<btns.length; i++){
				btns[i].setLabel(msg[i]);
			}
			
//			Button tmp=btns[0];
//			for(int i=0; i<btns.length-1; i++){
//				btns[i]=btns[i+1];
//			}
//			btns[8]=tmp;
//			for(int i=0; i<btns.length; i++){
//				p.add(btns[i],i);
//			}
//			validate();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex14 me = new Ex14();
		Thread thr=new Thread(me);
		thr.start();
	}
}
