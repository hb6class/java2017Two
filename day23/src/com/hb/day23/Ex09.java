package com.hb.day23;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		
//		Dialog dlg=new Dialog(f,"���̾�α�",true);
		FileDialog dlg=new FileDialog(f,"����",FileDialog.SAVE);
//		dlg.setTitle("���̾�α�");
		dlg.setBounds(2000, 400, 300, 200);
		dlg.setVisible(true);
		System.out.println(dlg.getDirectory());
		System.out.println(dlg.getFile());
		
		f.setBounds(1600,0,500,300);
		f.setVisible(true);
	}

}
