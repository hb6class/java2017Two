package com.hb.day06;

import java.util.Scanner;

public class Ex02 {
	// 클래스 구성요소
	// 1. 메서드
	// 2. 필드
	// 	선언 초기화 동시
	//  or 선언 - 기본값
	// 정수 - 0;
	// 실수 - 0.0;
	// boolean - false;
	// char - '/u0000'
	
	public static int a;
	public static int b;
	public static int c;
	

	public static void main(String[] args) {
		// 3개의 수를 입력받고
		// 이들을 오름차순 정렬하시오
		// 1번째>7
		// 2번째>9
		// 3번째>5
		// 결과> 5<7<9
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째:");
		String input1=sc.nextLine();
		System.out.print("두번째:");
		String input2=sc.nextLine();
		System.out.print("세번째:");
		String input3=sc.nextLine();
		int su1=Integer.parseInt(input1);
		int su2=Integer.parseInt(input2);
		int su3=Integer.parseInt(input3);
		a=su1;
		b=su2;
		c=su3;
		sort();
		System.out.println(a+"<"+b+"<"+c);
	}
	
	public static void sort(){
		int tmp=0;
		int tmp2=0;
		if(a<b && a<c){
			//가장작은 a
			if(b<c){
				
			}else if(c<b){
				tmp=b;
				b=c;
				c=tmp;
			}
		}else if(b<a && b<c){
			//가장작은 b
			tmp=a;
			a=b;
			if(tmp<c){
				b=tmp;
			}else if(c<tmp){
				b=c;
				c=tmp;
			}
		}else if(c<a && c<b){
			//가장작은 c
			tmp=a;
			a=c;
			if(a<b){
				tmp2=b;
				b=tmp;
				c=tmp2;
			}else if(b<a){
				c=tmp;
			}
		}
	}
}













