package com.hb.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex05 extends Frame implements TextListener{
	Button btn;
	TextField tf;
	public Ex05() {
		super("텍스트이벤트");
		
		Panel p=new Panel();
		tf=new TextField(20);
		tf.addTextListener(this);
		p.add(tf);
		
		btn = new Button("전송");
		p.add(btn);
		btn.setEnabled(false);
		this.add(p);
		this.setBounds(1600, 0, 500, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("발동"+((TextField)(e.getSource())).getText());
//		TextField tf=(TextField)(e.getSource());
		char[] chs=tf.getText().toCharArray();
		for(int i=0; i<chs.length; i++){
			if(!Character.isDigit(chs[i])){
//				System.out.println("숫자만 쓰세요");
				tf.setSelectionStart(i);
				break;
			}
		}
		btn.setEnabled(true);
	}

}
