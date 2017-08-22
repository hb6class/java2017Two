package com.hb.day22;

import java.util.Arrays;

class Lec01{
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 ={1,3,5,7,9};
		int[] arr2 ={1,3,5,7,9};
		
		System.out.println(arr1==arr2);
		System.out.println(arr1.equals(arr2));
		System.out.println("------------------");
		boolean tf=true;
		if(arr1.length!=arr2.length){
			tf=false;
		}else{
			for(int i=0; i<arr1.length; i++){
				if(arr1[i]!=arr2[i]){
					tf=false;
					break;
					}
			}
		}
		System.out.println("arr1°ú arr2 :"+tf);
		System.out.println("------------------");
		System.out.println(java.util.Arrays.equals(arr1, arr2));
		System.out.println("------------------");
		int[] arr3=new int[arr1.length];
//		for(int i=0; i<arr1.length; i++){
//			arr3[i]=arr1[i];
//		}
		//
//		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		arr3=Arrays.copyOf(arr1, arr1.length);
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i] +" ");
		}
		System.out.println("\n------------------");
		Lec01[] lecs={
				new Lec01()
				,new Lec01()
				,new Lec01()
				,new Lec01()				
		};
		System.out.println(lecs.length);
		System.out.println(lecs[0]);
		Lec01[] lecs2=Arrays.copyOf(lecs, 1);
//		Arrays.<Lec01>copyOf(lecs, 1);
//		Arrays.copyOf(lecs, 1);
		System.out.println(lecs2.length);
		System.out.println(lecs2[0]);
		
	}

}





















