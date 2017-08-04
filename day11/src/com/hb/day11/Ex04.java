package com.hb.day11;

public class Ex04 {

	public static void main(String[] args) {
		int[] arr1={2015,2016,2017,2018};
//		int[] arr2={0,1,2016,2017,4,5};
		
		int[] arr2=new int[6];
		for(int i=0; i<arr2.length; i++){
			arr2[i]=i;
		}
		
		System.arraycopy(arr1, 1, arr2, 2, 2);
		
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}

	}

}
