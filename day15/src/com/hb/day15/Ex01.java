package com.hb.day15;

abstract class Lec01{
	//추상클래스
	//추상메서드를 갖는 클래스
	//추상클래스 - 추상메서드 0개 이상 갖고
	//일반적으로 객체의 생성이 불가
	//일반적으로 목적 - 상속을 목적으로 
	int su;
	
	public Lec01() {
	}
	
	void func01(){
		System.out.println("Lec01-func01()");
	}
	//추상메서드-abstract-메서드의 선언,구현x
	abstract void func02();
	
}

public class Ex01 extends Lec01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lec01 lec = new Lec01();
//		lec.func02();
		System.out.println("test");
		Ex01 me = new Ex01();
		
	}

	@Override
	void func02() {
		// TODO Auto-generated method stub
		
	}

}









