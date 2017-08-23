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
		f.setTitle("제목없음 - 메모장");
		
		MenuBar mb = new MenuBar();
		
		Menu mn1=new Menu("파일(F)");
		MenuItem mn1_1 = new MenuItem("새로만들기(N)");
		MenuItem mn1_2 = new MenuItem("열기(O)");
		MenuItem mn1_3 = new MenuItem("저장(S)");
		MenuItem mn1_4 = new MenuItem("끝내기(X)");
		mn1.add(mn1_1);
		mn1.add(mn1_2);
		mn1.add(mn1_3);
		mn1.addSeparator();
		mn1.add(mn1_4);
		
		Menu mn2=new Menu("편집(E)");
		Menu mn3=new Menu("서식(O)");
		
		Menu mn3_1=new Menu("글꼴");
		CheckboxMenuItem mn3_1_1=new CheckboxMenuItem("굴림체");
		CheckboxMenuItem mn3_1_2=new CheckboxMenuItem("궁서체");
		CheckboxMenuItem mn3_1_3=new CheckboxMenuItem("나눔체");
		
		mn3_1.add(mn3_1_1);
		mn3_1.add(mn3_1_2);
		mn3_1.add(mn3_1_3);
		mn3.add(mn3_1);
		
		Menu mn4=new Menu("보기(V)");
		
		CheckboxMenuItem mn4_1 =new CheckboxMenuItem("상태표시줄(S)");
		mn4.add(mn4_1);
		
		Menu mn5=new Menu("도움말(H)");
		MenuItem mn5_1=new MenuItem("도움말 보기(H)"); 
		MenuItem mn5_2=new MenuItem("도움말 정보(A)");
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
