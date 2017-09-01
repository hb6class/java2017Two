package com.hb.day29;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex08 {

	public static void main(String[] args) {
		Student stu=new Student(90, 80, 70);
		
		File f=new File("C:\\jtest\\test\\student.bin");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(f);
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(stu);
			System.out.println("학생입력완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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












