package com.hb.day23;

import java.awt.CheckboxGroup;
import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		f.setTitle("������� - �޸���");
		
		MenuBar mb = new MenuBar();
		
		Menu mn1=new Menu("����(F)");
		MenuItem mn1_1 = new MenuItem("���θ����(N)");
		MenuItem mn1_2 = new MenuItem("����(O)");
		MenuItem mn1_3 = new MenuItem("����(S)");
		MenuItem mn1_4 = new MenuItem("������(X)");
		mn1.add(mn1_1);
		mn1.add(mn1_2);
		mn1.add(mn1_3);
		mn1.addSeparator();
		mn1.add(mn1_4);
		
		Menu mn2=new Menu("����(E)");
		Menu mn3=new Menu("����(O)");
		
		Menu mn3_1=new Menu("�۲�");
		CheckboxMenuItem mn3_1_1=new CheckboxMenuItem("����ü");
		CheckboxMenuItem mn3_1_2=new CheckboxMenuItem("�ü�ü");
		CheckboxMenuItem mn3_1_3=new CheckboxMenuItem("����ü");
		
		mn3_1.add(mn3_1_1);
		mn3_1.add(mn3_1_2);
		mn3_1.add(mn3_1_3);
		mn3.add(mn3_1);
		
		Menu mn4=new Menu("����(V)");
		
		CheckboxMenuItem mn4_1 =new CheckboxMenuItem("����ǥ����(S)");
		mn4.add(mn4_1);
		
		Menu mn5=new Menu("����(H)");
		MenuItem mn5_1=new MenuItem("���� ����(H)"); 
		MenuItem mn5_2=new MenuItem("���� ����(A)");
		mn5.add(mn5_1);
		mn5.addSeparator();
		mn5.add(mn5_2);

		mb.add(mn1);
		mb.add(mn2);
		mb.add(mn3);
		mb.add(mn4);
		mb.add(mn5);
		
		f.setMenuBar(mb);
		
		TextArea ta = new TextArea();
		f.add(ta);
		f.setBounds(1600,0,500,300);
		f.setVisible(true);
	}

}
