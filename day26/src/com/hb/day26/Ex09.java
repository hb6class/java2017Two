package com.hb.day26;


class Lec09 extends Thread{
	static int tot=0;
	int start;
	int end;
	static Object obj = new Object();
	
	public Lec09(int a, int b) {
		start=a;
		end=b;
	}
	
//	public synchronized void sum(int su){
//	public synchronized static void sum(int su){
	public static void sum(int su){
	// 	synchronized되면 오직 하나의 스레드만 실행가능
//		tot+=su;
		synchronized (obj) {
			tot=tot+su;			
		}
	}
	
	@Override
	public void run() {
		// 1+2+3..... 1000=499500
		// 1+2+3..... 500=
		// 501+502+503..... 1000=
		for(int i=start; i<=end; i++){
			sum(i);
		}
	}
}


public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lec09 lec = new Lec09(1,100);
		Lec09 lec = new Lec09(1,500);
		Lec09 lec2 = new Lec09(501,1000);
		lec.start();
		lec2.start();
		try {
			lec.join();
			lec2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(lec.tot);
		System.out.println(lec2.tot);
	}

}
