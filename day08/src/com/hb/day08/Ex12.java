package com.hb.day08;

public class Ex12 {

	public static void main(String[] args) {
		// ¡Ú ¡Ú ¡Ú ¡Ú 
		// ¡Ú ¡Ú ¡Ú 
		// ¡Ú ¡Ú  
		// ¡Ú
		int line=4;
		int su=0;
		for(int i=0; i<10; i++){
			if(su==line){
				System.out.println();
				line--;
				su=0;
			}
			System.out.print("¡Ú ");
			su++;
		}
		
		
		
//		int line=10;
//		for(int j=0; j<line; j++){
//			for(int i=0; i<line-j; i++){
//				System.out.print("¡Ú ");
//			}
//			System.out.println();
//		}
	}

}
