package com.hb.day25;

class Lec06 extends Thread{
	String name;
	@Override
	public void run() {
		for(int i=0; i<100; i++){
			System.out.println(name+"의 i="+i);
		}
	}
}

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec06 lec1=new Lec06();
		Lec06 lec2=new Lec06();
		lec1.name="스레드1";
		lec2.name="스레드2";
		lec1.start();
		lec2.start();
	}

}
