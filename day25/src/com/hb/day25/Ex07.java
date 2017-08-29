package com.hb.day25;

class Lec07 extends Thread{
	
	public Lec07(String name) {
		super();
	}
	
	@Override
	public void run() {
		for(int i=0; i<5000; i++){
			System.out.println(getName()+":"+i);
		}
	}
}

public class Ex07 {

	public static void main(String[] args) {
		
		Lec07 lec1=new Lec07("스레드1");
		Lec07 lec2=new Lec07("스레드2");
		lec1.start();
		lec2.start();
	}

}
