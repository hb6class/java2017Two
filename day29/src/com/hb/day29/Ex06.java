package com.hb.day29;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ex06 {

	public static void main(String[] args) {
		// 오브젝트 스트림
		Vector vec = new Vector();
		vec.addElement(1234);
		vec.addElement(3.14);
		vec.addElement("자료");
		Vector vec2 = new Vector();
		vec2.addElement("4-1");
		vec2.addElement("4-2");
		vec2.addElement("4-3");
		vec2.addElement("4-4");		
		vec.addElement(vec2);
		
		
		File f = new File("./files/test01.bin");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			if(!f.exists()){
					f.createNewFile();
			}
			fos=new FileOutputStream(f);
			oos=new ObjectOutputStream(fos);
			oos.writeObject(vec);
			
			System.out.println("작성확인");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}











