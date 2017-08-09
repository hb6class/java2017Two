package com.hb.day09;

import java.util.Scanner;

class Bank{
	String name;
	int money;
	
	public Bank(String msg) {
		name=msg;
	}
	
	void add(int a){
		money+=a;
	}
	
	boolean get(int a){
		boolean result=false;
		if(money>=a){
			money-=a;
			result=true;
		}
		return result;
		
	}
	void show(){
		System.out.println("현재잔고는 "+money+"원입니다");
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// 돈 은행CD
		// 1.잔고확인 2.입금 3.출금 0.종료
		int menu=0;
		int money=0;
		Bank hana = new Bank("신한은행");
		System.out.print("어서오세요");
		System.out.println("-"+hana.name);
		while(true){
			System.out.print("1.잔고확인 2.입금 3.출금 0.종료>");
			menu=input();
			switch (menu) {
			case 2:
				System.out.print("입금하실 금액을 입력해주세요>");
				money=input();
				hana.add(money);
				break;
			case 3:
				System.out.print("찾으실 금액을 입력해주세요");
				money=input();
				if(!hana.get(money)){
					System.out.println("잔액이 부족합니다");
				}
			case 1:
				hana.show();
				break;
			case 0:
				System.out.print("이용해주셔서 감사합니다");
				return;
	
			default:
				System.out.println("잘못입력하셨습니다");
				System.out.println("다시한번");
				break;
			}
		}
	}
	
	public static int input(){
		Scanner sc = new Scanner(System.in);
		String msg=sc.nextLine();
		return Integer.parseInt(msg);
	}

}











