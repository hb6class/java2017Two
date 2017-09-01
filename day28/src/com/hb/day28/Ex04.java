package com.hb.day28;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		long time1=System.currentTimeMillis();
		File f =new File("txt/test01.txt");
		File f2 =new File("txt/test02.txt");
		char[] cbuf=new char[1024];
		if(f.exists()){
			FileReader fr=null;
			FileWriter fw=null;
			try {
				f2.createNewFile();
				fr=new FileReader(f);
				fw=new FileWriter(f2);
				
				while(true){
					int su=fr.read(cbuf,0,50);
					if(su==-1){break;}
					fw.write(cbuf,0,su);
					fw.flush();
				}
				
				long time2=System.currentTimeMillis();
				System.out.println("파일 복사");
				System.out.println("걸린시간:"+(time2-time1)*0.001+"초");
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					fw.close();
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
