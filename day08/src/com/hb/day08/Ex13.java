package com.hb.day08;

public class Ex13 {

	public static void main(String[] args) {
//		  		@ @ @ �� 
//		  		@ @ �� �� 
//		  		@ �� �� �� 
//		 		�� �� �� ��
		int line=10;
		int su=line-1;
		for(int i=0; i<line; i++){
			for(int j=0; j<line; j++){
				if(j<su){
					System.out.print("��");
				}else{
					System.out.print("�� ");
				}
			}
			for(int j=0; j<i; j++){
				System.out.print("�� ");
			}
			System.out.println();
			su--;
		}
		
		
	}

}
