package com.hb.day10;

public class Ex09 {

	public static void main(String[] args) {
		// 1
		// 11
		// 111
		// 1111
		////////////////
		// 1+1=2
		// 11+2=13
		// 111+3=114
		// 1111+4=1115
		int su=1;
		int tmp=0;
//		int[] arr1= new int[4];
		String[] arr1= new String[4];
		for(int i=0; i<4; i++){
//			System.out.println(1);
//			System.out.println(10+1);
//			System.out.println(100+10+1);
//			System.out.println(1000+100+10+1);
			su=1;
			for(int j=0; j<i; j++){
				su*=10;
			}
			arr1[i]=tmp+su+"+"+(i+1)+"="+((tmp+su)+(i+1));
			tmp=tmp+su;
		}
		for(int i=0; i<4; i++){
			System.out.println(arr1[i]);
		}
		

	}

}
