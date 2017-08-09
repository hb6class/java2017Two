package com.hb.day08;

public class Ex04 {
	public static int sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 me = new Ex04();
		me.plus(1);
		me.plus(2);
		me.plus(3);
		me.plus(4);
		Ex04 me2 = new Ex04();
		me2.plus(5);
		me2.plus(6);
		me.show();
	}
	
	public void plus(int a){
		sum+=a;
	}
	
	public void show(){
		System.out.println("гу╟Х="+sum);
	}
}
