package com.hb.day10;

class Car{
	int speeds=100;
	public Car() {
	}
	boolean equals(Car car){
		return speeds==car.speeds;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Car car1;
		car1= new Car();
		
		Car car2=new Car();
		Car car3=car1;
//		car3=car1+car2;
		if(car1.equals(car2)){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	}

}
