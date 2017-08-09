package com.hb.day12;

class Car{
	private String model;
	int speeds;
	
	public Car(String name) {
		model=name;
	}
	
	void 달린다(){
		System.out.println(model+" 자동차가 "+speeds+"로 달린다");
	}
	void 멈춘다(){
		System.out.println(model+" 자동차가 "+speeds+"로 멈춘다");
		
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Car car1=new Car("모닝");
		Car car2=new Car("그랜져");
//		car1.model="모닝";
//		car2.model="그랜져";
		car1.달린다();
//		car2.model="마티즈";
		car2.달린다();
		
	}

}
