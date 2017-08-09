package com.hb.day10;

public class Ex07 {

	public static void main(String[] args) {
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		// * * * * * *
		// * * * * * * *
//		String[] star ={
//				"*"
//				,"* *"
//				,"* * *"
//				,"* * * *"
//				,"* * * * *"
//				,"* * * * * *"
//				,"* * * * * * *"
//				,"* * * * * * * *"
//		};
		int cnt=10;
		String msg="";
		String[] star = new String[cnt];
		
		for(int i=0; i<star.length; i++){
			msg="";
			for(int j=0; j<=i; j++){
				msg+="* ";
			}
			star[i]=msg;
		}
		
		
//		System.out.println(star.length);
		
		
		for(int i=0; i<star.length; i++){
			System.out.println(star[i]);
		}

	}

}
