package com.hb.day14;

class Mother{
	int su=100;
//	public Mother() {
//	}
	public Mother(int su) {
//		super();
		this.su=su;
	}
	
	public void func(){
		System.out.println("Mother");
	}
}


public class Ex02 extends Mother {
	int su=1234;
	Ex02(int su){
		super(1000);
		this.su=su;
	}
	Ex02(int su,int su2){
		this(su);
		System.out.println("");
	}
	Ex02(){
		this(4321,1234);
		System.out.println("唱 积己"+super.su);
		System.out.println("唱 积己"+this.su);
		System.out.println("唱 积己"+su);
	}

	@Override
	public void func(){
		super.func();
		System.out.println("Me");
	}

	public static void main(String[] args) {
		Mother me = new Ex02();
		System.out.println(me.su);
		me.func();
	}

}
