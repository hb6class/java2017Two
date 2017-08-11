package com.hb.day15;

abstract class 도형{
	int 길이 =10;
	
	abstract void 그리다();
}

class 사각형 extends 도형{

	@Override
	void 그리다() {
		System.out.println("길이 "+길이+"cm인 사각을 그리다");
	}
	
}

class 원 extends 도형{

	@Override
	void 그리다() {
		System.out.println("길이 "+(길이/2)+"cm의 반지름 원을 그리다");
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		사각형 obj1= new 사각형();
		obj1.그리다();
		원 obj2=new 원();
		obj2.그리다();
		도형 obj3=new 사각형();
		obj3.그리다();
	}

}
