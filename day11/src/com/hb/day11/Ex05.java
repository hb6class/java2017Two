package com.hb.day11;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,2,3,4,5};
		int[] arr2={1,2,3,4};
		
		boolean result=true;
		if(arr1.length==arr2.length){
			for(int i=0; i<arr1.length; i++){
				if(arr1[i]!=arr2[i]){
					result=false;
					break;
				}
			}
		}else{
			result=false;
		}
				
		if(result){
			System.out.println("두배열은 같다");
		}else{
			System.out.println("두배열은 다르다");			
		}
	}

}
