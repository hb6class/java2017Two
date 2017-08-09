package com.hb.day14;

public class Son extends Father {
	// 상속
	// class 클래스명 extends 상속받을 클래스명{}
	// 단, 자바 - 다중상속x
	// 대상 - 필드(static,non-static),메소드(static,non-static)
	
	public int money=1234;
//	
//	public void getMoney(int money){
//		this.money-=money;
//	}
//	
//	public void putMoney(int money){
//		this.money+=money;
//	}
//	
	// 메소드 오버라이드-재정의
	public void showMoney(){
		System.out.println("바꿈");
	}
	public void giveMe(int money){
		this.money-=money;
	}
	
	public boolean equals(Object obj) {
		
		return this.money==((Son)obj).money;
	}
	
	public void pocket(){
		System.out.println("용돈이 "+money+"원 남았습니다");
		System.out.println(su);
	}
}
