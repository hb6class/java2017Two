package com.hb.day07;

public class Ex10 {

	public static void main(String[] args) {
		// �ݺ���
		/*
		 * for��
		 * for(�ʱⰪ;����;����){���๮;}
		 * 
		 * 
		 * while��
		 * while(����){}
		 * 
		 * 
		 * do while��
		 * do{}while(����);
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
