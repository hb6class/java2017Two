package com.hb.day08;

public class Ex02 {
	public static int su=100;
		
	public static void main(String[] args) {
		// 
		show();
		plus(10);
		show();
		plus(10);
		show();
		Ex02 me = new Ex02();
		me.plus2(10);
		show();
		me.plus2(10);
		show();
		Ex02 me2 = null;
		me2= new Ex02();
		me2.plus2(20);
		show();
		String msg = new String()+100+10;
		String msg2= ""+100+10;
		System.out.println(msg);
		
	}
	
	public int plus2(int a){
		su+=a;
		return 10;
	}

	public static void plus(int a){
		su+=a;
	}
	public static void show(){
		System.out.println("su="+su);
	}
	
}
