package com.hb.day25;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");
	}

}
