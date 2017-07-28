package com.hb.day06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//입력을 2번받아
		// 아래를 출력하는 프로그램을 제작
		
		// 몇줄>4
		// 1.숫자 2.★ >1
		
		// 1
		// 1 2 
		// 1 2 3
		// 1 2 3 4
		
		/////////////
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		
		// 1.숫자 2.★ >2
		// ★
		// ★ ★
		// ★ ★ ★
		// ★ ★ ★ ★
		
		Scanner sc = new Scanner(System.in);
		System.out.print("line num>");
		String input1=sc.nextLine();
		int su1=Integer.parseInt(input1);
		System.out.print("1or2>3");
		String input2=sc.nextLine();
		int su2=Integer.parseInt(input2);
		int limit=su1;
		int tmp=su2;
		if(tmp==1){
			triangle(limit);
		}else if(tmp==2){
			triangle(limit,true);
		}else if(tmp==3){
			triangle(limit,true,"@");
		}
	}
	
	public static void triangle(int limit){
		triangle(limit,false);
	}
	
	public static void triangle(int limit,boolean tf){
		triangle(limit,tf,"★");
	}
	public static void triangle(int limit,boolean tf,String star){
		String mark="";
		for(int b=1; b<=limit; b++){
			for(int a=1; a<=b; a++){
				if(tf){
					mark=star;
				}else{
					mark=a+"";
				}
				System.out.print(mark+" ");
			}
			System.out.println();
		}
	}
	
}
