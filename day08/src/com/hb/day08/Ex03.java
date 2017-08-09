package com.hb.day08;

public class Ex03 {
	public static int su1=100;
	public int su2=200;

	public static void main(String[] args) {
		// 클래스의 구성요소
		// 1.메서드 
		//	1-1. static
		//	1-2. non-static - 멤버메서드, non-static메서드
		// 2. 전역변수
		//	2-1. static - 클래스변수
		//	2-2. non-static - 맴버필드, non-static변수
		System.out.println("su1="+su1);
		Ex03 me = new Ex03();
		System.out.println("su2="+me.su2);
	}
	
	public void func01(){
		int a=100;
		// 지역변수
		System.out.println("f1="+su1);
		System.out.println("f2="+su2);
	}

}
