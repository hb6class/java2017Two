package com.hb.day14;

class Ex55{
	
	public static void func01(){
		System.out.println("Ex55-func01()");
	}
	
}

public class Ex05 extends Ex55 {

//	public void func01(){
//		System.out.println("Ex55-func01()");
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex05 me = new Ex05();
		Ex05.func01();
	}

}
