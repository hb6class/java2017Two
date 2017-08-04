package com.hb.day11;

import java.util.Scanner;

class Factory{
	int milk;
	int sugar;
	
	void plusMilk(int a){
		milk+=a;
	}
	void plusSugar(int a){
		sugar+=a;
	}
	void minusMilk(int a){
		if(milk-a>=0){
			milk-=a;
		}
	}
	void minusSugar(int a){
		if(sugar-a>=0){
			sugar-=a;
		}
	}
	int createBox(){
		// 2x:3y=100:??
		
//		milk*2 sugar*3
		int ea=0;
		int tmp1=milk/2;//66
		int tmp2=sugar/3;//150
		if(tmp1<tmp2){
			ea=tmp1;
		}else{
			ea=tmp2;
		}
		System.out.print("우유:"+milk);
		System.out.print("설탕:"+sugar+"로 ");
		System.out.println(ea+"개 생산가능하고");
		return ea/20;
	}
	
}

public class Ex11 {

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
		Factory fac=new Factory();
		int inn=0;
		while(true){
			System.out.print("1.입고 2.출고 3.생산가능수량 0.종료>");
			inn=input();
			switch (inn) {
			case 1:
				System.out.println("1.우유 2.설탕 0.뒤로>");
				inn=input();
				if(inn==1){
					fac.plusMilk(input());
				}else if(inn==2){
					fac.plusSugar(input());
				}
				break;
			case 2:
				System.out.println("1.우유 2.설탕 0.뒤로>");
				inn=input();
				if(inn==1){
					fac.minusMilk(input());
				}else if(inn==2){
					fac.minusSugar(input());
				}
				break;
			case 3:
				System.out.println("현 자제로는 "+fac.createBox()+"box 생산가능합니다");
				break;
			case 0:
				System.out.println("감사합니다");
				return;
			default:
				break;
			}
		}

	}
	public static int input(){
		Scanner sc=new Scanner(System.in);
		String tmp=sc.nextLine();
		return Integer.parseInt(tmp);
	}

}
