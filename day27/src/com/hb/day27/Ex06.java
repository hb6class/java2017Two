package com.hb.day27;

import java.io.File;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// c:\jtest\test\test3.txt
		Scanner sc = new Scanner(System.in);
		System.out.print("대상>");
		String path=sc.nextLine();
		File f1= new File(path);
		System.out.print("바꿀>");
		String path2=sc.nextLine();
		File f2= new File(path2);
		if(f1.exists()){
			if(f1.renameTo(f2)){
				System.out.println("바꾸기 성공");
			}else{
				System.out.println("바꾸기 성공");				
			}
		}else{
			System.out.println("대상이 존재하지 않음");				
		}
	}

}
