package com.hb.day11;

public class Ex01 {

	public static void main(String[] args) {
		// 1.랜덤 Math.random
		// 2.중복
		// 3.sort
		
		int[] arr1 = new int[5];
		arr1[0]= 1234;
		arr1[1]= 3213;
		arr1[2]= 4353;
		arr1[3]= 5865;
		arr1[4]= 4595;
		
		// 배열복사(얕은복사) arr2=arr1;
//		int[] arr2 = arr1;
		
		// 배열복사(깊은복사)
		int[] arr2 = new int[5];
		for(int i=0; i<5; i++){
			arr2[i]=arr1[i];
		}
		
		
		
		arr2[1]=0;
		
		
		for(int i=0; i<5; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n-----------------------");
		for(int i=0; i<5; i++){
			System.out.print(arr2[i]+" ");
		}
		
		
	}

}








