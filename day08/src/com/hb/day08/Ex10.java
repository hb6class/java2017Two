package com.hb.day08;

public class Ex10 {

	public static void main(String[] args) {
		// Q7.	1+2+3+...+m<500�� ������ m=?�����ΰ�?
		int i=0;
		int sum=0;
//		while(true){
		for(;;){
			i++;
			sum+=i;
			if(sum>=500){
				break;
			}
		}
		System.out.println("m="+(i-1));
		
		
	}

}
