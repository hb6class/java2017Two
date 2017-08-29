package com.hb.day26;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex03{
	
	class MyFrame extends Frame{
		
		public MyFrame() {
			super("창");
			setBounds(1600, 0, 500, 300);
			setVisible(true);
		}
		
	}
	
	class Listen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			f.dispose();
		}
		
	}
	MyFrame f=new MyFrame();
	
	public Ex03() {
		Panel p = new Panel();
		Button btn1 = new Button("종료1");
		btn1.addActionListener(new Listen());
		Button btn2 = new Button("종료2");
		btn2.addActionListener(new Listen());
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		p.add(btn1);
		p.add(btn2);
		f.add(p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  Ex03();
	}

}
