package com.hb.day14;

public class Ex01 extends Object {

	public static void main(String[] args) {
		// 5장. 상속
		
		Father fa=new Father();
		Son son=new Son();
		
		fa.showMoney();
		son.pocket();
		son.showMoney();
		son.showSu();
		
		System.out.println(fa.color);
		System.out.println(son.color);
		System.out.println("---------------------------");
		
		// 자바의 장점 - 다형성
		Father fa2=new Son();
//		Son son2=new Father();
		
//		fa2.putMoney(20);
//		System.out.println(fa2.money);
//		fa2.giveMe(10);
		System.out.println(fa2.money);
		fa2.showMoney();
		
		Son son3=(Son)fa2;
		System.out.println(son3.money);
		son3.showMoney();
		
		Object fa4=new Father();
		Father fa5=(Father)fa4;
		
		Son son10 = new Son();
		Son son11 = new Son();
		if(son10.equals(son11)){
			System.out.println("같다");
		}else{
			System.out.println("다르다");			
		}
		System.out.println(son10.toString());
		System.out.println(son11.toString());
	}

}














