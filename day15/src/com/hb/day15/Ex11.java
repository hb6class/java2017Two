package com.hb.day15;

public class Ex11 {

	public static void main(String[] args) {
		// 배열의 동적할당
		
		// 변수의 목적
		int[] su1=new int[0];
		
		su1=new int[1];
		// add
		
		int[] tmp=new int[su1.length];
//		for(int i=0; i<su1.length; i++){
//			tmp[i]=su1[i];
//		}
		System.arraycopy(su1, 0, tmp, 0, su1.length);
		su1=new int[su1.length+1];
//		for(int i=0; i<tmp.length; i++){
//			su1[i]=tmp[i];
//		}
		System.arraycopy(tmp, 0, su1, 0, tmp.length);
		// add
	}

}
