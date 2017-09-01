package com.hb.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) {
//		File f= new File("txt/test01.txt");
		File f= new File("txt\\test01.txt");
		String msg="";
		
		FileReader fr=null;
		char[] cbuf=new char[5];
		try {
			fr=new FileReader(f);
			while(true){
				int su=fr.read(cbuf);
				System.out.println("("+su+")");
				if(su==-1){break;}
				msg+=new String(cbuf,0,su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		////////////////////////////////////////
//		FileInputStream fis=null;
//		try {
//			fis=new FileInputStream(f);
//			
//			while(true){
//				int su=fis.read();
//				if(su==-1){break;}
//				msg+=(char)su;
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally{
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		System.out.println(msg);
	}

}
