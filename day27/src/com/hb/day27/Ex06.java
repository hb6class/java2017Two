package com.hb.day27;

import java.io.File;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// c:\jtest\test\test3.txt
		Scanner sc = new Scanner(System.in);
		System.out.print("���>");
		String path=sc.nextLine();
		File f1= new File(path);
		System.out.print("�ٲ�>");
		String path2=sc.nextLine();
		File f2= new File(path2);
		if(f1.exists()){
			if(f1.renameTo(f2)){
				System.out.println("�ٲٱ� ����");
			}else{
				System.out.println("�ٲٱ� ����");				
			}
		}else{
			System.out.println("����� �������� ����");				
		}
	}

}
