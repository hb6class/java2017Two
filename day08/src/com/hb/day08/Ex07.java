package com.hb.day08;

class Kia{
	public int speeds;
	public String name;
	public String color;
	
	public void speedUp(int up){
		speeds+=up;
	}
	
	public void show(){
		System.out.println("현재 "+color+name+"의 속도는 "+speeds+"km입니다");
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Kia car1=null;
		car1= new Kia();
		Kia car2= new Kia();
		car1.name="모닝";
		car2.name="k5";
		car1.color="흰색";
		car2.color="검정색";
		car1.show();
		car2.show();
		car1.speedUp(10);
		car1.show();
		car2.show();
		car1.speedUp(20);
		car2.speedUp(50);
		car1.show();
		car2.show();
		car1=null;

	}

}
