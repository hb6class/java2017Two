package com.hb.day29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class Ex07 {

	public static void main(String[] args) {
		File f = new File("./files/test01.bin");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(f);
			ois=new ObjectInputStream(fis);
			
			Vector vec=(Vector)ois.readObject();
			
			System.out.println(vec.elementAt(0));
			System.out.println(vec.elementAt(1));
			System.out.println(vec.elementAt(2));
			Vector vec2=(Vector)vec.elementAt(3);
			System.out.println(vec2.elementAt(0));
			System.out.println(vec2.elementAt(1));
			System.out.println(vec2.elementAt(2));
			System.out.println(vec2.elementAt(3));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
