package com.hb.day24;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex03 extends Frame implements MouseListener{
	
	private TextArea ta;
	private TextField tf;
	private Button btn1;
	private Button btn2;

	public Ex03() {
		super("채팅창");
		
		Font f= new Font("새굴림",Font.PLAIN, 20);
		
		ta=new TextArea();
		tf=new TextField(20);
		btn1=new Button("전송");
		btn2=new Button("종료");
		
		ta.setFont(f);
		tf.setFont(f);
		btn1.setFont(f);
		btn2.setFont(f);
		
		btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		
		Panel pMain = new Panel(new BorderLayout());
		Panel pDown = new Panel();
		
		pDown.add(tf);
		pDown.add(btn1);
		pDown.add(btn2);
		
		pMain.add(ta, BorderLayout.CENTER);
		pMain.add(pDown, BorderLayout.SOUTH);
		
		this.add(pMain);
		this.setBounds(1600, 0, 400, 600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex03();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn2){
			System.exit(0);
		}
		if(e.getSource()==btn1&&!(tf.getText().equals(""))){
			String msg=ta.getText();
			if(msg.equals("")){
				ta.setText(tf.getText());				
			}else{
				ta.setText(msg+"\n"+tf.getText());
				}
			tf.setText("");
		}
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
