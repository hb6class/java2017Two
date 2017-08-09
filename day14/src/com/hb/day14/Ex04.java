package com.hb.day14;

import java.util.Scanner;

class Ex44{
	static Ex44 single =new Ex44();
	public final int su=4321;
	
	private Ex44(){}
	
	public void func02(){
		System.out.println("non-static func2()");
	}
}

public class Ex04{
	final double py;// 상수형 변수
	
	Ex04() {
		py=3.14;
	}	
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		
	}
	
	public static void main(String[] args) {
		// 접근...
		// 1. 접근제한자
		// public > protected > default > private
		// 2. final
		// final class - 상속 거부
		
		System.out.println(Ex44.single.su);
		Ex44.single.func02();
		
//		final int a=4;
//		a=444;
//		Ex04 me = new Ex04();
//		System.out.println(me.su);
//		me.py=3333.4444;
//		System.out.println(me.py);
		
//		Ex44 ex44=new Ex44();
//		me.func01();
//		com.hb.ex.Ex44 ex44=new com.hb.ex.Ex44();
//		System.out.println(ex44.su);
//		ex44.func01();
	}

}












