package com.hb.day26;

public class Ex05 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex05 me1 = new Ex05();
		Ex05 me2 = new Ex05();
		
		
		me1.start();
		me2.start();
	}

	
	@Override
	public void run() {
		for(int i=0; i<20; i++){
			System.out.println(getName()+":"+i);
		}
	}
}
