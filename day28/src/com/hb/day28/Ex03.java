package com.hb.day28;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File f= new File("txt\\test01.txt");
		String msg="�ڹٷ�\t���ڿ�\n�ۼ��ϱ�";
		
		char[] ch=msg.toCharArray();
		
		FileWriter fw=null;
		int cnt=0;
		try {
			fw=new FileWriter(f);
//			for(int i=0; i<ch.length; i++){
//				fw.write(ch[i]);
//			}
			for(int j='��'; j<'��'+1; j++){
				for(int i=0; i<'��'-'��'+1; i++){
					fw.write(i+j);
					cnt++;
				}
				fw.write("\r\n");
			}
			System.out.println("�ۼ��Ϸ�");
			System.out.println(cnt+"��");
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
