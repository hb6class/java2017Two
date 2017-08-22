package com.hb.day17;

public class Ex02 {
	// 변수
	int sum=1000;
	// 지역변수  & 전역변수(클래스바로 아래)
	
	// static & non-static
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=100;
		for(int i=0; i<3; i++){
			int b=i;
		}
		try{
			int c=400;
		}catch(Exception e){
			System.out.println();
		}
		System.out.println();
	}
	void func01(int g){
		System.out.println(g);
	}
}
