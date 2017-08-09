package com.hb.day09;

class Morning{
	static int speeds=0;
	static int max=100;
	
	static void speedUp(int up){
		speeds+=up;
	}
}
class Sm5{
	static int speeds=0;
	static int max=150;
	
	static void speedUp(int up){
		speeds+=up;
	}
}

class K7{
	static int speeds=0;
	static int max=180;
	
	static void speedUp(int up){
		speeds+=up;
	}
}

class Sonata{
	static int speeds=0;
	static int max=200;
	
	static void speedUp(int up){
		speeds+=up;
	}
}


public class Ex04 {

	public static void main(String[] args) {
		// ¸ð´×(~100), sm5(~150), k7(~180)
		
		speedShow(Morning.speeds,Sm5.speeds,K7.speeds);
		Morning.speedUp(10);
		speedShow(Morning.speeds,Sm5.speeds,K7.speeds);
		Morning.speedUp(10);
		Sm5.speedUp(20);
		speedShow(Morning.speeds,Sm5.speeds,K7.speeds);
		Morning.speedUp(10);
		Sm5.speedUp(20);
		K7.speedUp(30);
		speedShow(Morning.speeds,Sm5.speeds,K7.speeds);
		Morning.speedUp(10);
		Sm5.speedUp(20);
		K7.speedUp(30);
		speedShow(Morning.speeds,Sm5.speeds,K7.speeds);
		Morning.speedUp(10);
		Sm5.speedUp(20);
		K7.speedUp(30);
		speedShow(Morning.speeds,Sm5.speeds,K7.speeds);
		
	}
	public static void speedShow(int a, int b, int c){
		System.out.print("¸ð´×:"+a+"km , ");
		System.out.print("SM5:"+b+"km , ");
		System.out.println("K7:"+c+"km ");
	}

}
