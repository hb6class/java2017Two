package com.hb.day07;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		String msg=input;
		
		if(msg.equals("java")){
			System.out.println("자바수업입니다");			
		}else{
			System.out.println("쉬는 시간입니다");			
		}
		
		
//		switch (msg) {
//		case "web":
//			System.out.println("웹수업입니다");
//			break;
//		case "spring":
//			System.out.println("프레임워크수업입니다");
//			break;
//		case "java":
//			System.out.println("자바수업입니다");
//			break;
//		default:
//			System.out.println("쉬는 시간입니다");
//			break;
//		}
		
	}

}
