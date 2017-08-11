package com.hb.day16;

class Outer01{
	static int a=100;
	int b=300;
	static class Inner01{
		static int num01=100;
		int num02=200;
		
		static void func01(){
			Outer01 outt=new Outer01();
			System.out.println("Inner-f1()"+outt.b);
		}
		void func02(){
			Outer01 outt=new Outer01();
			System.out.println("Inner-f2()"+outt.b);
			
		}
	}
	void func03(){
		System.out.println("Outer-f3()");
		Inner01.func01();
		System.out.println(Inner01.num01);
		System.out.println(a);
		Inner01 innn=new Inner01();
		innn.func02();
		System.out.println(innn.num02);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Outer01.Inner01.num01);
		Outer01.Inner01.func01();
		Outer01.Inner01 inn=new Outer01.Inner01();
		inn.func02();
		System.out.println(inn.num02);
		Outer01 outt=new Outer01();
		System.out.println("----------------------------------");
		outt.func03();
	}

}
