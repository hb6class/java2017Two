package com.hb.day18.am;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		
		try{
			
			throw new ArithmeticException();
			
		}catch(ArithmeticException e){
			System.out.println("에러발동");
		}
		
		System.out.println("main end");
	}

}
