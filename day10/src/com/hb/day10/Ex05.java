package com.hb.day10;

public class Ex05 {

	public static void main(String[] args) {
		// 배열 구조
		// 자료형[] 변수명 = new 자료형[갯수];
		// 배열선  언 : 자료형[] 변수명;
		// 배열초기화 : 변수명 = new 자료형[갯수];
		int[] arr1 = new int[3];
		// 값의초기화 : 변수명[인덱스]=valse;
		// 인덱스 : 반드시 0부터 시작~연속되고~갯수-1
		arr1[0]=1;
		arr1[1]=3;
		arr1[2]=5;
		
		// 사용 : 변수명[인덱스]
		
		int[] arr2=new int[]{1,2,3,4};
		
		int[] arr3={100,200,300,400};
		
		for(int i=0; i<4; i++){
			System.out.println(arr3[i]);
		}
		
		
		
	}

}













