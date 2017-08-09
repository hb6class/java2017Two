package com.hb.day09;

import java.util.Scanner;

public class Ex10 {
	static int milk;
	static int sugar;

	public static void main(String[] args) {
		// 
		// 자제관리 프로그램(ver 0.0.1)
		// 
		//	아이스크림(1ea) = 우유(2ml) + 설탕(3g)
		//	아이스크림 1box = 20ea;
		//
		// 1.입고	2.출고	3.생산가능수량	0.종료
		// >1
		// 1.우유 2.설탕 0.뒤로
		// >2
		// 1.우유 2.설탕 0.뒤로
		// >3
		// 총 00박스 생산가능(몇박스생산가능 한지)
		int num=0;
		
		while(true){
			System.out.print("1.입고 2.출고 3.생산가능수량 0.종료>");
			num=input();
			if(menu(num)){
				break;
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}
	
	static void sec(int a){
		int num=0;
		System.out.print("1.우유 2.설탕 0.뒤로>");
		num=input();
		if(a==1){
		menuOne(num,true);
		}else{
		menuOne(num,false);
		}
	}
	
	static void menuOne(int num, boolean tf){
		int su;
		switch (num) {
		case 1:
			System.out.print("우유(ml)?");
			su=input();
			if(tf){milk+=su;}
			else{milk-=su;}
			break;
		case 2:
			System.out.print("설탕(g)?");
			su=input();
			if(tf){sugar+=su;}
			else{sugar-=su;}
			break;
			
		default:
			break;
		}
	}
	
	static boolean menu(int num){
		boolean end=false;
		switch (num) {
		case 0:
			end=true;
			break;
		case 1:
		case 2:
			sec(num);
			break;
		case 3:
			// 생산가능수량
			show();
			break;

		default:
			System.out.println("입력에러");
			break;
		}
		return end;
	}
	static void show(){
		System.out.print("우유"+milk);
		System.out.println(",설탕"+sugar);
	}
	
	static int input(){
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		int su = Integer.parseInt(msg);
		return su;
	}
}

















