package com.hb.day16;

public class Ex07 {

	
	
	public static void main(String[] args) {
		// 예외 처리
		int su=0;
		int[] arr=new int[3];
		try{
			System.out.println(1);
			System.out.println(2);
					System.out.println(5/0);
					su=Integer.parseInt("a");
//			System.out.println(arr[3]);
			System.out.println(3);
		}catch(IndexOutOfBoundsException ex){
			System.out.println("배열의 인덱스 오버");
		}catch(NumberFormatException ex){
		System.out.println("숫자포맷이 아니기에 ");
//		}catch(ArithmeticException ex){
//		System.out.println("0으로 나눔으로 일어나는 에러 ");
		}catch(Exception ex){
		}
		System.out.println("END");
	}

}
