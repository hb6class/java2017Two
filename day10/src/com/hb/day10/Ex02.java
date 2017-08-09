package com.hb.day10;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg1="java";
		String msg2="java";
		String msg3=new String("java");
//		String msg4=sc.nextLine();
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		
		if(msg3.equals(msg1)){
			System.out.println("같은 자바입니다");
		}else{
			System.out.println("다른 자바입니다");
		}
	}

}
