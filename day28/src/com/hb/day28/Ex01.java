package com.hb.day28;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) {
		// ���ڿ���Ʈ��
		File f = new File("./txt/test01.txt");
		String msg ="Hello Java World";
		
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(f);
			
			fw.write(msg);
			
			System.out.println("�ۼ��Ϸ�");
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









