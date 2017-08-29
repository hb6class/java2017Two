package com.hb.day26;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex01 extends Frame implements KeyListener {
	TextField tf;
	public Ex01() {
		addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});
		Panel p = new  Panel();
		
		tf = new TextField(15);
//		tf.addTextListener(l);
//		tf.addActionListener(l);
		tf.addKeyListener(this);
		tf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf.setText("");
			}
		});
		p.add(tf);
		
		Button btn = new  Button("버튼");
		p.add(btn);
		tf.setText("아이디를 작성");
		add(p);
		// 기능 - 메서드
		setSize(500, 300);
		setLocation(1600, 0);
		setVisible(true);
//		System.out.println(tf.getText());
	}
	
	
	public static void main(String[] args) {
		// AWT Swing 
		// GWT - google
		// ...javaFX
		// AWT-class명  Swing-Jclass명
		new Ex01();
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
		// TODO Auto-generated method stub
//		if('0'<=e.getKeyCode()<='9'){
		if(Character.isDigit(e.getKeyChar())){
			
		}else{
			Dialog log=new Dialog(this, "오류",true);
			log.setLayout(new GridLayout(2,1));
			Label la = new Label("숫자만 입력");
			Button logEnd=new Button("확인");
			logEnd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					tf.setSelectionStart(0);
					log.dispose();
				}
			});
			log.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					tf.setText("");
					log.dispose();
				}
			});
			
			log.add(la);
			log.add(logEnd);
			log.setSize(100, 100);
			log.setVisible(true);
		}
	}

}
