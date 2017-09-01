package com.hb.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("./txt/test01.txt");
		try {
			FileInputStream fis=new FileInputStream(f);
			
			InputStream inn = fis;
			java.util.Scanner sc =new Scanner(inn);
			System.out.print(">");
			String msg = sc.next();
			System.out.println(msg);
			msg = sc.next();
			System.out.println(msg);
			msg = sc.next();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
