package com.hb.day27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\jtest\\test\\test3.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
//			for(int i=0; i<19; i++){
//				int su=fis.read();
//				System.out.print((char)su);
//			}
			while(true){
				int su=fis.read();
				if(su==-1){break;}
				System.out.print((char)su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
