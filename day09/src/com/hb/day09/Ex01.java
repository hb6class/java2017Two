package com.hb.day09;

import com.hb.ex.Ex03;
import com.hb.ex.*;

class Ex011{
	// 객체의 표현
	// 전역변수 - 속성
	// 메서드 - 기능
	void func01(){}
}

class Ex01 {

	public static void main(String[] args) {
		// 접근제한자
		// public(모두) > default(동일 패키지 내부) > private(본인클래스 내부)
		// 클래스, 전역변수, 메서드 모두 가능
		// 단, 클래스 private 불가
		
		com.hb.day09.Ex011 ex1=new Ex011();
		ex1.func01();
		Ex02 ex2=new Ex02();
		ex2.func01();
//		System.out.println(ex2.id);
		Ex03 ex3 = new Ex03();
		ex3.func01();
		Ex04 ex4=new Ex04();
//		ex4.func01();
	}

}













