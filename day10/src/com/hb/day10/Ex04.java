package com.hb.day10;

public class Ex04 {

	public static void main(String[] args) {
		// 배열 목적
		int a1=100;
		int a2=121;
		int a3=302;
		int a4=403;
		int a5=504;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		int[] b = new int[5];
//		b[0]=200;
//		b[1]=201;
//		b[2]=202;
//		b[3]=203;
//		b[4]=204;
		for(int i=0; i<5; i++){
			b[i]=300+i;
		}
		
		for(int i=0; i<5; i++){
			System.out.println(b[i]);
		}

	}

}
