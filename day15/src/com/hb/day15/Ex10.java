package com.hb.day15;

public class Ex10 {
	int sum=1234;
	
	// 맴버 내부클래스
	// static 존재x
	class Inner{
		static final int su1=100;
		int su2=200;
		public Inner() {
			System.out.println("Inner생성");
		}
//		static void func01(){
//			System.out.println();
//		}
		void func02(){
			System.out.println("Inner-func02()");
		}
	}
	
	void mainFunc(){
		System.out.println(sum);
		Inner innn=new Inner();
		innn.func02();
		System.out.println(innn.su2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex10 me = new Ex10();
//		me.(new Inner());
		Inner inn=me.new Inner();
		inn.func02();
		System.out.println(inn.su2);
	}

}










