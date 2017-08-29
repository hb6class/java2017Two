package com.hb.day24;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex11 extends Frame implements KeyListener {
	TextField tf;
	public Ex11() {
		Font f=new Font("������",Font.BOLD, 20);
		Panel p = new Panel();
		
		tf = new TextField(20);
		tf.addKeyListener(this);
		tf.setFont(f);
		p.add(tf);
		
		Button btn = new Button("��ư");
		p.add(btn);
		
		this.add(p);
		this.setBounds(1600, 0, 500, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex11();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Ű���� ������ �Էµɶ�");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Ű���� ����");
//		System.out.println(e.getKeyCode());
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Ű���� (���ȴ�)�ö��");
//		System.out.println(tf.getText());
//		int cnt=tf.getText().length();
//		char[] ch=tf.getText().toCharArray();
//		System.out.println(ch[cnt-1]);
	}

}
