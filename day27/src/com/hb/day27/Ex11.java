package com.hb.day27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		File resource=new File("C:\\jtest\\test\\1차2조.mp4");
		File target=new File("C:\\jtest\\test\\target.mp4");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		byte[] buff=new byte[256];
		if(resource.exists()){
			try {
				target.createNewFile();
				fis=new FileInputStream(resource);
				fos=new FileOutputStream(target);
				while(true){
					int cnt=fis.read(buff, 0, buff.length);
					if(cnt==-1){break;}
					fos.write(buff, 0, cnt);
				}
				System.out.println("파일복사 완료");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fis.close();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
