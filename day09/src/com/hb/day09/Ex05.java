package com.hb.day09;

class Car{
	String model="";
	int speeds;
	private int max;
	
	public Car(int a) {
		max=a;
	}
	
	void speedUp(int up){
		if(speeds+up<=max){speeds+=up;}else{speeds=max;}
	}
	
	void speedDown(int down){
		if(speeds-down>=0){speeds-=down;}else{speeds=0;}
	}
}


public class Ex05 {

	public static void main(String[] args) {
		Car morning = new Car(100);
//		morning.max=120;
		Car sm5 = new Car(150);
//		sm5.max=150;
		Car k7 = new Car(180);
//		k7.max=180;
		Car sonata = new Car(200);
//		sonata.max=200;
		
		for(int i=0; i<20; i++){
			morning.speedUp(10);
			sm5.speedUp(20);
			k7.speedUp(30);
			Ex04.speedShow(morning.speeds, sm5.speeds, k7.speeds);
		}
		for(int i=0; i<50; i++){
			morning.speedDown(30);
			sm5.speedDown(20);
			k7.speedDown(10);
			Ex04.speedShow(morning.speeds, sm5.speeds, k7.speeds);			
		}
	}

}











