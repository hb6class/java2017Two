package com.hb.day25;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.plaf.SliderUI;

public class Ex17 extends Frame implements Runnable, ActionListener {
	Button[] btns;
	static int time;
	Button bstart;
	Button bend;
	public Ex17() {

		Panel p =new Panel(new BorderLayout());
		
		Panel p1 =new Panel(new GridLayout(3,3));
		Panel p3 =new Panel();
		btns= new Button[9];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button("버튼"+(i+1));
			p1.add(btns[i]);
			btns[i].setEnabled(false);
		}

		Panel p2 =new Panel();
		bstart=new Button("시작");
		bstart.addActionListener(this);
		bend=new Button("종료");
		bend.addActionListener(this);
		bend.setEnabled(false);
		p2.add(bstart);
		p2.add(bend);
		
		p.add(p1, BorderLayout.CENTER);
		p.add(p2, BorderLayout.EAST);
		p.add(p3, BorderLayout.SOUTH);
		add(p);
		setBounds(1600, 0, 600, 500);
		setResizable(false);
		setVisible(true);
		
	}
	public void gameStart(){
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(true);
		}		
	}
	public void gameEnd(){
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(false);
		}		
		bstart.setEnabled(true);
		bend.setEnabled(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("시작")){
			Thread thr= new Thread(this);
			gameStart();
			thr.start();
			time=30;
			bstart.setEnabled(false);
			bend.setEnabled(true);
		}else if(e.getActionCommand().equals("종료")){
			time=0;
			gameEnd();
		}
		
	}
	@Override
	public void run() {
		while(time>0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			time--;
		}
		gameEnd();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex17();
	}


}
