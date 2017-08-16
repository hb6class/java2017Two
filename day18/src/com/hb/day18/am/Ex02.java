package com.hb.day18.am;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args)  throws ArithmeticException,NumberFormatException{
		// TODO Auto-generated method stub
//		try{
		func01(1,0);
//		}catch(ArithmeticException ex){
//			System.out.println("func01 하다가 에러남");
//		}catch(NumberFormatException ex){
//			System.out.println("func01 하다가 문자포멧에러남");
//		}
		System.out.println("main end");
	}
	
	public static void func01(int a, int b) throws ArithmeticException,NumberFormatException{
		Scanner sc = new Scanner(System.in);
//		try{
			int c=Integer.parseInt(sc.nextLine());
			System.out.println(a/b);
//		}catch(ArithmeticException ex){}
			System.out.println("func01 end");
	}

}
