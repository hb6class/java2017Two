package com.hb.day17;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a1='a';
		System.out.println(a1+1);
		
		Character ch1=new Character('a');
		char[] arr1={' ','A','a','#','°¡','1','ùÛ'};
		for(int i=0; i<arr1.length; i++){
			System.out.print("arr1["+i+"]="
					+Character.isWhitespace(arr1[i])+" ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+"="
					+Character.isLetter(arr1[i])+" ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+"="
					+Character.isDigit(arr1[i])+" ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+"="
					+Character.isAlphabetic(arr1[i])+" ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+"="
					+Character.isUpperCase(arr1[i])+" ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+"="
					+Character.isLowerCase(arr1[i])+" ");
		}
		System.out.println();
		
	}

}
