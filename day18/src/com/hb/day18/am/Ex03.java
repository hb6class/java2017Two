package com.hb.day18.am;

import java.util.Scanner;

public class Ex03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int result=0;
		while(true){
		System.out.print("�����Է�>");
//		String msg=sc.nextLine();
//		try{
//		a=Integer.parseInt(msg);
//		}catch(NumberFormatException ex){
//			ex.printStackTrace();
//		}
		try{
		result= input();
		}catch(java.util.InputMismatchException ex){
			sc=new Scanner(System.in);
		}catch(ArithmeticException ex){
			System.out.println("0���� ����");
			continue;
		}
		System.out.println("100���Է��Ͻż��ڷ� ������ "+result);
		}
	}
	
	static int input() throws ArithmeticException,java.util.InputMismatchException{
		int a=sc.nextInt();
		return 100/a;
	}
}







