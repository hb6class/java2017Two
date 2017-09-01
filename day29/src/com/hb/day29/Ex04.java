package com.hb.day29;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		InputStream is = null;
		byte[] buff=new byte[1024];
		try {
			URL url=new URL("http://www.godo.co.kr/echost/solution/main.gd");
			is = url.openStream();
			File f=new File("./files/google.html");
			fos=new FileOutputStream(f);
			
			while(true){
				int su=is.read(buff);
				if(su==-1){break;}
				fos.write(buff, 0, su);
				fos.flush();
			}
			System.out.println("º¹»ç³¡");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fos.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}









