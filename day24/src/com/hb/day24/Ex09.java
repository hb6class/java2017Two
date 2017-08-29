package com.hb.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex09 extends Frame{
	
	public Ex09() {
		String[] msg={
				"Num"," / "," * "," - "," 7 "," 8 "," 9 "," + "
				," 4 "," 5 "," 6 "," 1 "," 2 "," 3 ","Ent"," 0 "," . "
		};
		Button[] btns=new Button[msg.length];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(msg[i]);
		}
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		GridBagLayout gbl=new GridBagLayout();
		
		Panel p =new Panel(gbl);
		// 1 row
		gbc=setGbc(gbc,0,0,1,1,0.25,0.25);
		p.add(btns[0],gbc);
		gbc=setGbc(gbc,1,0,1,1,0.25,0.25);
		p.add(btns[1],gbc);
		gbc=setGbc(gbc,2,0,1,1,0.25,0.25);
		p.add(btns[2],gbc);
		gbc=setGbc(gbc,3,0,1,1,0.25,0.25);
		p.add(btns[3],gbc);
		// 2 row
		gbc=setGbc(gbc,0,1,1,1,0.25,0.25);
		p.add(btns[4],gbc);
		gbc=setGbc(gbc,1,1,1,1,0.25,0.25);
		p.add(btns[5],gbc);
		gbc=setGbc(gbc,2,1,1,1,0.25,0.25);
		p.add(btns[6],gbc);
		gbc=setGbc(gbc,3,1,1,2,0.25,0.25);
		p.add(btns[7],gbc);
		// 3 row
		gbc=setGbc(gbc,0,2,1,1,0.25,0.25);
		p.add(btns[8],gbc);
		gbc=setGbc(gbc,1,2,1,1,0.25,0.25);
		p.add(btns[9],gbc);
		gbc=setGbc(gbc,2,2,1,1,0.25,0.25);
		p.add(btns[10],gbc);
		// 4 row
		gbc=setGbc(gbc,0,3,1,1,0.25,0.25);
		p.add(btns[11],gbc);
		gbc=setGbc(gbc,1,3,1,1,0.25,0.25);
		p.add(btns[12],gbc);
		gbc=setGbc(gbc,2,3,1,1,0.25,0.25);
		p.add(btns[13],gbc);
		gbc=setGbc(gbc,3,3,1,2,0.25,0.25);
		p.add(btns[14],gbc);
		// 5 row
		gbc=setGbc(gbc,0,4,2,1,0.5,0.25);
		p.add(btns[15],gbc);
		gbc=setGbc(gbc,2,4,1,1,0.25,0.25);
		p.add(btns[16],gbc);
		
		this.add(p);
		this.setBounds(1600, 0, 400, 500);
		this.setVisible(true);
	}
	
	public GridBagConstraints setGbc(
			GridBagConstraints gbc,int a,int b, int c, int d, double e, double g){
		gbc.gridx=a;
		gbc.gridy=b;
		gbc.gridwidth=c;
		gbc.gridheight=d;
		gbc.weightx=e;
		gbc.weighty=g;
		return gbc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex09();
	}

}









