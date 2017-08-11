package com.hb.day16.am;

public class OuterStatic {
	static int a=100;
	
	public static Inner01 conn=new Inner01();
	
	public static class Inner01{
//		static int num01=100;
		int num02=200;
		
		private Inner01() {
		}
		
//		public static void func01(){
//			System.out.println("Inner-f1()");
//		}
		public void func02(){
			System.out.println("Inner-f2()");
		}

		public static void func01() {
			// TODO Auto-generated method stub
			
		}
	}
	void func03(){
		System.out.println("Outer-f3()");
//		Inner01.func01();
//		System.out.println(Inner01.num01);
//		System.out.println(a);
//		Inner01 innn=new Inner01();
//		innn.func02();
//		System.out.println(innn.num02);
	}
}
