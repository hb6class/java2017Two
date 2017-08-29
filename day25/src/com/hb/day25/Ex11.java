package com.hb.day25;

import java.awt.Frame;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11 extends Frame implements Runnable{
	Label la;
	public Ex11() {
		
		la =new Label();
		
		add(la);
		setBounds(1600, 0, 300, 300);
		setVisible(true);
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			Date date=new Date();
			SimpleDateFormat df= new SimpleDateFormat("hh:mm:ss");
			la.setText(df.format(date));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		Ex11 me = new Ex11();
		Thread thr=new Thread(me);
		thr.start();
	}


}
