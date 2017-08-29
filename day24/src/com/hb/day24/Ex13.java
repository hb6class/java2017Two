package com.hb.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyMouse implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex13 extends Frame{
	
	public Ex13() {
		
		Panel p = new Panel();
		
		Button btn=new Button("@");
		
		MouseListener listener=new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("버튼클릭");
			}
		};
		
		btn.addMouseListener(listener);
		p.add(btn);
		
		add(p);
		setBounds(1600, 0, 500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex13();
	}

}
