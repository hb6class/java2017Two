package com.hb.day16;


class Outer04{
	static int su1=100;
	int su2=200;
	
	interface Inter{
		void inFunc02();
	}
	
	public Outer04() {
		// TODO Auto-generated constructor stub
	}
	
	void func01(){
		System.out.println("Outer-f1");
		int a=100;
		return;
	}
	
	Inter func02(){
		System.out.println("Outer-f2");
		// local class - 메소드 내의 내부 클래스
		// 특징 - ~1.7 필드 non-static (x)
		// 			1.8 (o)
		
		class Inner04 implements Inter{
			
			public void inFunc02(){
				System.out.println("Inner-f2");
			}
		}	// inner end
		
		return new Inner04();
	}
	
}



public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer04 outt=new Outer04();
//		Outer04.Inter inter=outt.func02();
//		inter.inFunc02();
		outt.func02().inFunc02();
	}

}
