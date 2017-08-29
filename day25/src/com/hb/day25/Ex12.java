package com.hb.day25;

class Lec12 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<20; i++){
			System.out.println("Lec12:"+i);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Lec22 extends Thread{
	Thread thr;
	@Override
	public void run() {
			for(int i=0; i<5; i++){
			System.out.println("Lec22:"+i);
				try {
					this.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				thr.join();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			for(int i=5; i<20; i++){
				System.out.println("Lec22:"+i);
				try {
					this.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
}

public class Ex12 {

	public static void main(String[] args) {
//		System.out.println("main start");
		Lec12 lec1 = new Lec12();
		Lec22 lec2 = new Lec22();
		lec2.thr=lec1;
		lec1.start();
		lec2.start();
//		try {
//			lec1.join();
//			lec2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("main end");
		
	}

}







