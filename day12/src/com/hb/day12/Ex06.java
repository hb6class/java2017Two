package com.hb.day12;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] su = {1,2,3,4};
		int[] copy = new int[su.length];
		for(int i=0; i<copy.length; i++){
			copy[i]=su[i];
		}
		
		int[] copy2=new int[su.length];
		System.arraycopy(su, 0, copy2, 0, su.length);
		
		for(int i=0; i<copy2.length; i++){
			System.out.println(copy2[i]);
		}
	}

}
