package com.hb.day27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {
		String msg="";
		File f=new File("C:\\jtest\\test\\test3.txt");
		FileInputStream fis=null;
		byte[] buff= new byte[10];
		//abcd'\r'
		//'\n'abcd
		//fabcd
		try {
			fis=new FileInputStream(f);
			
			while(true){
				
//				Arrays.fill(buff, (byte)0);
				int su=fis.read(buff,0,buff.length);
//				System.out.println("("+su+")");
				if(su==-1){break;}
				msg=msg+new String(buff,0,su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		System.out.println(msg);
	}
}
