package com.hb.day23;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex06 extends Frame{
	
	public Ex06() {
		super("사원등록");
		
		String[] msg={
				"사원","성별","주민번호","주소"
				,"부서명","취미","자기소개"
		};
		
		Label[] las=new Label[msg.length];
		for(int i=0; i<las.length; i++){
			las[i]=new Label(msg[i]);
		}
		
		TextField[] tfs=new  TextField[4];
		for(int i=0; i<tfs.length; i++){
			tfs[i]=new TextField();
		}
		
		Panel gender=new Panel();
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox male=new Checkbox("남",cbg,true);
		Checkbox female=new Checkbox("여",cbg,false);
		gender.add(male);
		gender.add(female);
		
		Panel jumin = new Panel();
		jumin.add(tfs[1]);
		jumin.add(new Label("-"));		
		jumin.add(tfs[2]);
		tfs[1].setColumns(6);
		tfs[2].setColumns(7);
		
		Choice list = new Choice();
		list.addItem("기획부");
		list.addItem("총무부");
		list.addItem("영업부");
		list.addItem("인사부");
		
		Panel hobby=new Panel();
		Checkbox hobby1=new Checkbox("운동",true);
		Checkbox hobby2=new Checkbox("음악감상");
		Checkbox hobby3=new Checkbox("영화");
		Checkbox hobby4=new Checkbox("컴퓨터");
		hobby.add(hobby1);
		hobby.add(hobby2);
		hobby.add(hobby3);
		hobby.add(hobby4);
		
		Panel pMain=new Panel(new BorderLayout());
		Panel pCntr=new Panel(new GridBagLayout());
		Panel pDown=new Panel(new FlowLayout());
		
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=0.25;
		gbc.weighty=1.0;
		
		// row 1
		pCntr.add(las[0],gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		pCntr.add(tfs[0],gbc);
		gbc.gridx=2;
		gbc.gridy=0;
		pCntr.add(las[1],gbc);
		gbc.gridx=3;
		gbc.gridy=0;
		pCntr.add(gender,gbc);
		// row 2
		gbc.gridx=0;
		gbc.gridy=1;
		pCntr.add(las[2],gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=2;
		pCntr.add(jumin,gbc);
		// row 3
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		pCntr.add(las[3],gbc);
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=3;
		pCntr.add(tfs[3],gbc);
		// row 4
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=1;
		pCntr.add(las[4],gbc);
		gbc.gridx=1;
		gbc.gridy=3;
		pCntr.add(list,gbc);
		// row 5
		gbc.gridx=0;
		gbc.gridy=4;
		pCntr.add(las[5],gbc);
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.gridwidth=3;
		pCntr.add(hobby,gbc);
		// row 6
		gbc.gridx=0;
		gbc.gridy=5;
		gbc.gridwidth=4;
		gbc.weightx=1.0;
		pCntr.add(las[6],gbc);
		
		TextArea ta= new TextArea();
		gbc.gridx=0;
		gbc.gridy=6;
		gbc.gridwidth=4;
		gbc.weightx=1.0;
		pCntr.add(ta,gbc);
		
		pMain.add(pCntr,BorderLayout.CENTER);
		
		Button btn1= new Button("저장");
		Button btn2= new Button("종료");
		pDown.add(btn1);
		pDown.add(btn2);
		pMain.add(pDown,BorderLayout.SOUTH);
		add(pMain);
		init();
	}
	public void init(){
		
		setBounds(1600, 0, 400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
	}

}
