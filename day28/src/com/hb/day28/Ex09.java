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
//				fw.write("안녕자바".toCharArray());
//				fw.write("\r\n");
//				fw.write("\n");
//				fw.write("또안녕자바");
//				fw.flush();
				pw.println("안녕자바2");
				pw.println("프린터 라이터로 작성");
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
