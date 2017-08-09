package com.hb.day14;

public class Father extends GrandFather {
	public int money=1000;
	public static int su=1111;
	
//	String color="백인";
//	
//	public void func(){
//		System.out.println("할아버지의 기능");
//	}
	
	public void getMoney(int money){
		this.money-=money;
	}
	
	public void putMoney(int money){
		this.money+=money;
	}
	
	public static void showSu(){
		System.out.println(su+"입니다");
	}
	
	public void showMoney(){
		System.out.println("잔고가 "+money+"원있습니다");
	}
}
