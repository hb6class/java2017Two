package com.hb.day29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex09 {

	public static void main(String[] args) {
		File f=new File("./files/student.bin");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(f);
			ois=new ObjectInputStream(fis);
			
			Student stu=(Student)ois.readObject();
			
			System.out.println(stu.kor);
			System.out.println(stu.eng);
			System.out.println(stu.math);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}











