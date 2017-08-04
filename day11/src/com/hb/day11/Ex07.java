package com.hb.day11;

public class Ex07 {

	public static void main(String[] args) {
		// 이중배열 구구단
		// int[9][8]
		// 2x1=2	3	4	5	6 ...
		// 2x2=4	6	8	.....
		// 2x3=6	9	....
		int[][] gugu=new int[9][8];
		
//		for(int n=1; n<10; n++){
//			for(int m=2; m<10; m++){
//				gugu[n-1][m-2]=m*n;
//			}
//		}
		
		for(int n=0; n<gugu.length; n++){
			for(int m=0; m<gugu[n].length; m++){
				gugu[n][m]=(m+2)*(n+1);
			}
		}
		
		
		
		for(int n=0; n<gugu.length; n++){
			for(int m=0; m<gugu[n].length; m++){
				System.out.print(gugu[n][m]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
