package com.hb.day28;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File f= new File("txt\\test01.txt");
		String msg="자바로\t문자열\n작성하기";
		
		char[] ch=msg.toCharArray();
		
		FileWriter fw=null;
		int cnt=0;
		try {
			fw=new FileWriter(f);
//			for(int i=0; i<ch.length; i++){
//				fw.write(ch[i]);
//			}
			for(int j='가'; j<'하'+1; j++){
				for(int i=0; i<'기'-'가'+1; i++){
					fw.write(i+j);
					cnt++;
				}
				fw.write("\r\n");
			}
			System.out.println("작성완료");
			System.out.println(cnt+"자");
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
