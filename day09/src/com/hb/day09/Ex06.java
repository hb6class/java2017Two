package com.hb.day09;

class Ex66{
	int a=0;
//	public Ex66() {}
//	Ex66(int b){
//		System.out.println("객체 생성"+b);
//		a=b;
//	}
//	Ex66(int b, String msg){
//		System.out.println(msg+"객체 생성"+b);
//		a=b;
//	}
	
	int su;
	
	void func01(){
		System.out.println("func01 a:"+a);
		
	}
	static void func02(){
		System.out.println("func02");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		// 클래스 기본구성요소
		// 1. 메서드(static, non-static)
		// 2. 필드(static, non-static)
		// 3. 생성자
		// 필드값의 초기화
		
		Ex66 ex66 = new Ex66();
//		ex66.Ex66();
		ex66.func01();
//		Ex66.func02();
	}

}
