package com.hb.day25;

public class Ex04 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Ex04 me=new Ex04();
		me.start();
		int sum=0;
		for(int i=0; i<5000; i++){
			sum+=i;
		}
		System.out.println("main end");
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++){
			System.out.println(i);
		}
	}

}
