package com.hb.day11;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit=3;
		char[][] arr1= new char[limit][];

		for(int i=0; i<limit; i++){
			arr1[i]=new char[i+1];
			
		}
//		arr1[0][0]=100;
//		
//		arr1[1][0]=200;
//		arr1[1][1]=201;
//
//		arr1[2][0]=300;
//		arr1[2][1]=301;
//		arr1[2][2]=302;
		
		for(int n=0; n<arr1.length; n++){
			for(int m=0; m<arr1[n].length; m++){
				arr1[n][m]='¡Ù';
			}
		}
		
		for(int m=0; m<arr1.length; m++){
			for(int n=0; n<arr1[m].length; n++){
				System.out.print(arr1[m][n]+" ");
			}
			System.out.println();
		}
	}

}








