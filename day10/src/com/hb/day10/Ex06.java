package com.hb.day10;

public class Ex06 {

	public static void main(String[] args) {
		// �迭���1~10���� �� ¦���� ����Ͻÿ�
		int[] arr1 = new int[5];
		
		for(int i=0; i<5; i++){
			arr1[i]=(i+1)*2;
		}
		
		for(int i=0; i<5; i++){
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		// A-Z���� �迭 ������
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














