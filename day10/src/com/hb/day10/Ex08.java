package com.hb.day10;

public class Ex08 {

	public static void main(String[] args) {
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		String msg="";
		int tmp=1;
		String[] arr2=new String[4];
		for(int i=0; i<arr2.length; i++){
//			msg=(0+1)+" ";
//			msg=(1+1)+" "+(1+2);
//			msg=(2+2)+" "+(2+3)+" "+(2+4);
//			msg=(3+4)+" "+(3+5)+" "+(3+6)+" "+(3+7);
			msg="";
			for(int j=0; j<(i+1); j++){
				msg=msg+(i+tmp)+" ";
				tmp++;
			}
			tmp--;
			arr2[i]=msg;
		}
		
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
//		int[] arr1= new int[4];
//		msg="";
//		String[] arr1=new String[6];
//		for(int i=0;i<arr1.length; i++){
//			msg+=(i+1)+"";
//			arr1[i]=msg;
//		}
//		
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
		
		
		
		
		// 1+1=2
		// 11+2=13
		// 111+3=114
		// 1111+4=1115
		
		

	}

}













