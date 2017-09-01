package com.hb.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("./txt/test01.txt");
		FileInputStream fis=null;
		Reader isr=null;
		File target= new File("./txt/test02.txt");
		FileOutputStream fos=null;
		Writer osw=null;
		char[] cbuf = new char[1024];
		if(f.exists()){
			try {
				fis=new FileInputStream(f);
				isr=new InputStreamReader(fis);
				
				fos=new FileOutputStream(target);
				osw=new OutputStreamWriter(fos);
				while(true){
					int su=isr.read(cbuf);
					if(su==-1){break;}
					osw.write(cbuf, 0, su);
					osw.flush();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					osw.close();
					isr.close();
					fos.close();
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
