package com.hb.day18.am;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		try{
			int a=5/0;
			
		}catch(Exception e){
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("main end");		
		}
	}

}
