package com.hb.day07;

public class Ex09 {

	public static void main(String[] args) {
		// 100 절대값을 구하시오
		
		int a=100;
		System.out.println(a+"의 절대값은 ");
		if(a>=0){
			a=+a;
		}else{
			a=-a;
		}
		
		System.out.println(a+"입니다");
	}

}
