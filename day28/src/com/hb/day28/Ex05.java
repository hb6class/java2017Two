package com.hb.day28;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		File f = new File("C:\\jtest\\test\\1차2조.mp4");
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		File target = new File("C:\\jtest\\test\\copy_1차2조.mp4");
		FileOutputStream fos=null;
		byte[] buff=new byte[50];
		BufferedOutputStream bos=null;
		if(f.exists()){
			if(!target.exists()){
				try {
						target.createNewFile();
						fis=new FileInputStream(f);
						bis=new BufferedInputStream(fis);
						
						fos=new FileOutputStream(target);
						bos=new BufferedOutputStream(fos);
						
						while(true){
							int su=bis.read(buff);
							if(su==-1){break;}
							bos.write(buff,0,su);
							bos.flush();
						}
						System.out.println("완료");
					} catch (IOException e) {
						e.printStackTrace();
					} finally{
						try {
							bos.close();
							fos.close();
							bis.close();
							fis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
			}
			
		}
		
	}

}
