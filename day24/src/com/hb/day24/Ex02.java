package com.hb.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Ex02 extends Frame implements MouseListener{
	Button btn1, btn2;
	
	public Ex02() {
		super("마우스 이벤트");
		
		Panel p= new Panel();
		
		btn1= new Button("PRINT");
		btn1.addMouseListener(this);
		p.add(btn1);
		
		btn2= new Button("종료");
		
		btn2.addMouseListener(this);
		p.add(btn2);
		
//		p.addMouseListener(this);
		add(p);
		setBounds(1600,0,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("마우스 눌렸다땜");
//		System.out.print("btn1:"+(e.getSource()==btn1)+",");
//		System.out.println("btn2:"+(e.getSource()==btn2));
		if(e.getSource()==btn2){
			System.exit(0);
		}else if(e.getSource()==btn1){
			System.out.println("실행");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("마우스 눌림");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("마우스 올라감");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("켜서가 위로 올라감");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("켜서가 빠져나감");
	}

}
