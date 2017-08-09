package com.hb.day10;

public class Ex06 {

	public static void main(String[] args) {
		// 배열사용1~10까지 중 짝수를 출력하시오
		int[] arr1 = new int[5];
		
		for(int i=0; i<5; i++){
			arr1[i]=(i+1)*2;
		}
		
		for(int i=0; i<5; i++){
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		// A-Z까지 배열 사용출력
//		char[] arr2={
//				'A','B','C','D','E','F','G'
//				,'H','I','J','K','L','M','N'
//				,'O','P','Q','R','S','T','U'
//				,'V','W','X','Y','Z'};
		
		int cnt='Z'-'A'+1;
		char[] arr2=new char[cnt];
		for(int i=0; i<cnt; i++){
			arr2[i]=(char)('A'+i);
		}
		
		for(int i=0; i<cnt; i++){
			System.out.print(arr2[i] +" ");
			if((i+1)%4==0){
				System.out.println();
			}
		}
		System.out.println();
	}

}














