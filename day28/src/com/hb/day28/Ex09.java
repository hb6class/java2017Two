package com.hb.day28;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("./txt/test02.txt");
		FileWriter fw=null;		
		PrintWriter pw=null;
		if(f.exists()){
			try {
				fw=new FileWriter(f);
				pw=new PrintWriter(fw);
//				fw.write("�ȳ��ڹ�".toCharArray());
//				fw.write("\r\n");
//				fw.write("\n");
//				fw.write("�Ǿȳ��ڹ�");
//				fw.flush();
				pw.println("�ȳ��ڹ�2");
				pw.println("������ �����ͷ� �ۼ�");
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
