package com.hb.day18.am;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 예외처리
		Scanner sc = new Scanner(System.in);
		try{
			int a =10/Integer.parseInt(sc.nextLine());
//		}catch(ArithmeticException ex){
//			System.out.println("0으로 나눔");
//		}catch (NumberFormatException e) {
//			System.out.println("숫자가 아님");
		}catch (Exception e) {
			e.printStackTrace();
//			System.out.println("1:"+e.toString());
//			System.out.println("2:"+e.getMessage());
//			StackTraceElement[] arr=e.getStackTrace();
//			for(int i=0; i<arr.length; i++){
//				System.out.println(arr[0]);
//			}
		}
	}

}
