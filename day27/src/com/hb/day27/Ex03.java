package com.hb.day27;

import java.io.File;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// c:\jtest\test\test1
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		String path=sc.nextLine();
		File f= new File(path);
		if(f.exists()){
			if(f.delete()){
				System.out.println("�����Ϸ�");
			}else{
				System.out.println("���丮�� ��� ���� �ʽ��ϴ�");
				
			}
		}else{
			System.out.println("�������� �ʽ��ϴ�");
		}
	}

}





