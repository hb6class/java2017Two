package com.hb.day07;

public class Ex10 {

	public static void main(String[] args) {
		// 반복문
		/*
		 * for문
		 * for(초기값;조건;증감){실행문;}
		 * 
		 * 
		 * while문
		 * while(조건){}
		 * 
		 * 
		 * do while문
		 * do{}while(조건);
		 * 
		*/
		for(int a=0; a<10; a++){
//			if(a%2==1){continue;}
			System.out.println("a="+a);
			
		}
		int b=0;
		while(b<10){
			if(b%2==1){
				b++;
				continue;
				}
			System.out.println("b="+b);
			b++;
		}
		System.out.println("---------------------------");
		
		
	}

}
