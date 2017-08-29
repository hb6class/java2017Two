package com.hb.day25;

class Lec08 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5000; i++){
			Thread thr=Thread.currentThread();
			System.out.println(thr.getName()+":"+i);
		}
	}
	
}

public class Ex08 {

	public static void main(String[] args) {
		Lec08 lec=new Lec08();
		Thread thr1=new Thread(lec);
		Thread thr2=new Thread(lec);
		thr1.start();
		thr2.start();
	}

}
