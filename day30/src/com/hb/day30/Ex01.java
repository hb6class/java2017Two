package com.hb.day30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.hb.day29.Student;

public class Ex01 {

	public static void main(String[] args) {
		File f=new File("C:\\jtest\\test\\student.bin");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(f);
			ois=new ObjectInputStream(fis);
			
			Student stu=(Student)ois.readObject();
			
			System.out.println(stu.kor);
			System.out.println(stu.eng);
			System.out.println(stu.math);
			stu.sum();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}







