package com.hb.day28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("./txt/test01.txt");
		FileReader fr=null;
		BufferedReader br=null;
		File target=new File(f.getParent()+"/copy01.txt");
		FileWriter fw=null;
		BufferedWriter bw=null;
		long time1, time2;
		char[] cbuf = new char[100];
		if(f.exists()){
			try {
				target.createNewFile();
				fr=new FileReader(f);
				br=new BufferedReader(fr);
				fw=new FileWriter(target);
				bw=new BufferedWriter(fw);
				time1=System.currentTimeMillis();
				while(true){
					int su=br.read(cbuf);
					if(su==-1){break;}
					bw.write(cbuf,0,su);
					bw.newLine();
				}
				fw.flush();
				time2=System.currentTimeMillis();
				System.out.println("복사완료");
				System.out.println("걸린시간:"+(time2-time1)*0.001+"초");
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					bw.close();
					br.close();
					fw.close();
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
