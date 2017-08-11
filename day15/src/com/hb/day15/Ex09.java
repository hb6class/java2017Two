package com.hb.day15;

public class Ex09 {
	
	// static 내부클래스 (static Inner 클래스)
	static class Inner{
		static int su1=200;
		int su2=100;
		public Inner() {
			System.out.println("Inner생성");
		}
		static void func01(){
			System.out.println("Inner-static func01");
		}
		void func02(){
			System.out.println("Inner-func02");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Ex09.Inner.su1);
		Ex09.Inner.func01();
		Ex09.Inner inn= new Ex09.Inner();
		inn.func02();
		System.out.println(inn.su2);
	}

}








