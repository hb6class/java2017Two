package com.hb.day12;

class Ex333{
	int a=100;
	static int b=200;
	
	void func01(){
		System.out.println("func01 a:"+this.a);
	}
	
	Ex333 func03(int su){
		this.a+=su;
		return this;
	}
	
	static void func02(){
		System.out.println("func02 b:"+Ex333.b);
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Ex333.b);
		Ex333.func02();
		Ex333 ex = new Ex333();
		System.out.println(ex.a);
		ex.a=1000;
		Ex333 ex2 = new Ex333();
		
		// 
		ex2.func03(1).func03(2).func03(3);
		
		
		ex.func01();
		ex2.func01();
		
		System.out.println("java"+"World"+"2017");
		System.out.println("java".concat("World"));
		System.out.println("java".concat("World".concat("2017")));
		System.out.println("java".concat("World").concat("2017"));
	}

}
