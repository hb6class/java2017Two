package com.hb.day27;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// c:\jtest\test\test3.txt
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		String path=sc.nextLine();
		File f= new File(path);
//		if(f.exists()){
//			System.out.println("Á¸ÀçÇÕ´Ï´Ù");
//		}else{
//			if(f.mkdirs()){
//				System.out.println("¸¸µë");
//			}else{
//				System.out.println("¸ø¸¸µë");				
//			}
			try {
				
				if(f.createNewFile()){
					System.out.println("¸¸µë");
				}else{
					System.out.println("¸ø¸¸µë");				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
//		}
	}

}













