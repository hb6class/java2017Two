package com.hb.day28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="java world\n�ѱ�";
		File f = new File("./txt/test02.txt");
		FileOutputStream fos=null;
		PrintStream ps=null;
		
		if(f.exists()){
			
			try {
				fos=new FileOutputStream(f);
				ps=new PrintStream(fos,true);
				
				ps.print("�ѱ�");
				ps.print("����");
				ps.print("\r\n");
				ps.println("�����ۼ�");
				ps.println("�������ۼ�");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally{
				ps.close();
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
