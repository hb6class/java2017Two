package com.hb.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Ex02 extends Frame implements MouseListener{
	Button btn1, btn2;
	
	public Ex02() {
		super("���콺 �̺�Ʈ");
		
		Panel p= new Panel();
		
		btn1= new Button("PRINT");
		btn1.addMouseListener(this);
		p.add(btn1);
		
		btn2= new Button("����");
		
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
//		System.out.println("���콺 ���ȴٶ�");
//		System.out.print("btn1:"+(e.getSource()==btn1)+",");
//		System.out.println("btn2:"+(e.getSource()==btn2));
		if(e.getSource()==btn2){
			System.exit(0);
		}else if(e.getSource()==btn1){
			System.out.println("����");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("���콺 ����");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("���콺 �ö�");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("�Ѽ��� ���� �ö�");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("�Ѽ��� ��������");
	}

}
