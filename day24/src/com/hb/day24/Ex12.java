package com.hb.day24;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex12 extends Frame implements ActionListener, KeyListener {
	
	private TextField tf;
	private TextArea ta;
	private Button btn1;
	private Button btn2;

	public Ex12() {
		// TODO Auto-generated constructor stub
		super("채팅창");
		Font f= new Font("새굴림",Font.BOLD,22);
		Panel p=new Panel(new BorderLayout());
		Panel down=new Panel(new BorderLayout());
		Panel down2=new Panel(new GridLayout(1,2));
		
		ta=new TextArea();
		
		tf=new TextField(10);
		btn1=new Button("전송");
		btn2=new Button("종료");
		
		ta.setEditable(false);
		ta.setFont(f);
		tf.setFont(f);
		btn1.setFont(f);
		btn2.setFont(f);
		
		tf.addKeyListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		down2.add(btn1);
		down2.add(btn2);
		down.add(tf,BorderLayout.CENTER);
		down.add(down2,BorderLayout.EAST);
		
		p.add(ta,BorderLayout.CENTER);
		p.add(down,BorderLayout.SOUTH);
		this.add(p);
		setBounds(1600, 0, 400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex12();
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
//		System.out.println(e.getKeyCode());
//		if(e.getKeyCode()==10){
		if(e.getKeyChar()=='\n'){
			if(!tf.getText().isEmpty()){
				if(ta.getText().isEmpty()){
//					ta.setText(tf.getText());
					ta.append(tf.getText());
				}else{
//					ta.setText(ta.getText()+"\n"+tf.getText());		
					ta.append("\n"+tf.getText());
				}
			}
			tf.setText("");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.getActionCommand());
		
		if("전송".equals(e.getActionCommand())){
				if(tf.getText().isEmpty()){
					return;
				}
				if(ta.getText().isEmpty()){
					ta.setText(tf.getText());
				}else{
					ta.setText(ta.getText()+"\n"+tf.getText());					
				}
		}else{
			this.dispose();
		}
		tf.setText("");
	}
	

}
