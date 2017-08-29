package com.hb.day25;

class Lec02 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<100; i++){
			System.out.println(i);
		}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Lec02 lec1=new Lec02();
		lec1.start();
		int sum=0;
		for(int i=0; i<8000; i++){
			sum+=i;
		}
		System.out.println("main end");
	}

}
