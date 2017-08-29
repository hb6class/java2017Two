package com.hb.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex04 extends Frame implements MouseMotionListener {
	Button btn;
	Panel p;
	public Ex04() {
		super("마우스이벤트");
		
		p= new Panel(null);
		btn = new Button("*");
		btn.setSize(30, 30);
		btn.setLocation(0, 0);
		btn.setVisible(true);
		p.add(btn);
		
		btn.addMouseMotionListener(this);
		
		this.add(p);
		this.setBounds(1600, 0, 500, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int w=p.getWidth()-btn.getWidth();
		int h=p.getHeight()-btn.getHeight();
		System.out.print(w+":");
		System.out.println(h);
		System.out.println("마우스 드레그"+e.getX()+":"+e.getY());
		if(btn.getX()<w&&btn.getY()<h){
			btn.setLocation(btn.getX()+e.getX(), btn.getY()+e.getY());
		}else if(e.getX()<=0&&e.getY()<=0){
			btn.setLocation(btn.getX()+e.getX(), btn.getY()+e.getY());			
		}else if(e.getX()<=0&&btn.getY()<h){
			btn.setLocation(btn.getX()+e.getX(), btn.getY()+e.getY());			
		}else if(btn.getX()<w&&e.getY()<=0){
			btn.setLocation(btn.getX()+e.getX(), btn.getY()+e.getY());			
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("마우스 움직임");
		
	}

}
