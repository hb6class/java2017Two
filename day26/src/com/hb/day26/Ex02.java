package com.hb.day26;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex02 extends Frame implements KeyListener{
	JButton btn;
	int topDown=130;
	int rightLeft=-100;
	public Ex02() {
		
		Panel p = new Panel(null);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("target.png");
		Icon icon=new ImageIcon(img);
		btn = new JButton(icon);
		btn.setBorderPainted(false);
		btn.addKeyListener(this);
		btn.setBounds(rightLeft,topDown,100,46);
		p.add(btn);
		add(p);
		Dimension xy = Toolkit.getDefaultToolkit().getScreenSize();
		
		setSize(500,400);
		setLocation(1600+xy.width/2-getWidth()/2,xy.height/2-getHeight()/2);
		setVisible(true);
		btn.setFocusable(true);
		gameStart();
	}
	public void gameStart(){
		int a=10;
		while(rightLeft<390){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rightLeft+=a;
			System.out.println(rightLeft);
			btn.setLocation(rightLeft, topDown);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyCode());
		//390:130
		if(e.getKeyCode()==39&&rightLeft<390){
			rightLeft+=10;
		}else if(e.getKeyCode()==40&&topDown<330){
			topDown+=10;
		}else if(e.getKeyCode()==37&&rightLeft>0){
			rightLeft-=10;
		}else if(e.getKeyCode()==38&&topDown>0){
			topDown-=10;
		}else if(e.getKeyCode()==40){
			topDown=0;
		}else if(e.getKeyCode()==38){
			topDown=330;
		}
		btn.setLocation(rightLeft,topDown);
		System.out.println(rightLeft+":"+topDown);
	}

}
