package com.hb.day25;

public class Ex05 implements Runnable {
	String name;
	public Ex05(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Runnable me = new Ex05("첫번째");
		Runnable me2 = new Ex05("두번째");
		Thread thr1 = new Thread(me);
		Thread thr2 = new Thread(me2);
		thr1.start();
		thr2.start();
		System.out.println("main end");
	}

	@Override
	public void run() {
		for(int i=0; i<100; i++){
			System.out.println(name+i);
		}
	}

}
