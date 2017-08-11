package com.hb.day16;

class Outer03{
	static int su0=100;
	int su1=100;
	class Inner03{
		static final int su1=3;
		int su3=300;
		
//		static void func01(){
//			System.out.println("Inner03-f1");
//		}
		void func02(){
			System.out.println("Inner03-f2 su1:"+su1);
		}
	}
	
	void func03(){
		System.out.println("Outer03-f3"+su1);
		Inner03 inn;
		inn=new Inner03();
		inn.func02();
//		System.out.println(inn.su2);
	}
}


public class Ex03 {

	public static void main(String[] args) {
		
		Outer03 outt=new Outer03();
//		System.out.println(outt.su0);
//		outt.func03();
		////////////////////////////////
//		outt.(new Inner03());
		Outer03.Inner03 inn=outt.new Inner03();
		inn.func02();
//		System.out.println(inn.su3);
//		System.out.println(inn.su2);
	}

}










