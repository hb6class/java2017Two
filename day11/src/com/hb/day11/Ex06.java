package com.hb.day11;

public class Ex06 {

	public static void main(String[] args) {
		// 다중배열
		
		int[][] arrs1=new int[3][2];
//		int[][] arrs1=new int[3][];
//		arrs1[0]=new int[2];
		arrs1[0][0]=1;
		arrs1[0][1]=2;
//		arrs1[1]=new int[2];
		arrs1[1][0]=3;
		arrs1[1][1]=4;
//		arrs1[2]=new int[2];
		arrs1[2][0]=5;
		arrs1[2][1]=6;
		
		for(int m=0; m<arrs1.length; m++){
			for(int n=0; n<arrs1[m].length; n++){
				System.out.print(arrs1[m][n]+" ");
			}
			System.out.println();
		}
		
	}

}
