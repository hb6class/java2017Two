package com.hb.day08;

public class Ex13 {

	public static void main(String[] args) {
//		  		@ @ @ ¡Ú 
//		  		@ @ ¡Ú ¡Ú 
//		  		@ ¡Ú ¡Ú ¡Ú 
//		 		¡Ú ¡Ú ¡Ú ¡Ú
		int line=10;
		int su=line-1;
		for(int i=0; i<line; i++){
			for(int j=0; j<line; j++){
				if(j<su){
					System.out.print("¡¡");
				}else{
					System.out.print("¡Ú ");
				}
			}
			for(int j=0; j<i; j++){
				System.out.print("¡Ú ");
			}
			System.out.println();
			su--;
		}
		
		
	}

}
