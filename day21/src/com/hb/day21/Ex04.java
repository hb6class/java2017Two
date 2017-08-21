package com.hb.day21;

public class Ex04 {

	public static void main(String[] args) {
		// 개선된 루프문
//		int[] arr={1,3,54,234,3656};
		String[] arr={"a","b","c"};
		
		
		for(String n : arr){
			n+="2017";
			System.out.println(n);
		}
		System.out.println("--------------------");
		for(int n=0; n<arr.length; n++){
			System.out.println(arr[n]);
		}
	}

}
