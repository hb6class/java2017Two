package com.hb.day26;

class Target01 extends Thread{
	@Override
	public void run() {
		int cnt=0;
		while(cnt<1000000){
			System.out.println(getName()+":run()"+cnt++);
		}
	}
}

class Control extends Thread{
	@Override
	public void run() {
		Target01 temp=new Target01();
		temp.start();
		synchronized (this) {
			try {
				sleep(1000);
				temp.wait();
				sleep(2000);
				temp.notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class Ex08 {

	public static void main(String[] args) {
		Control cntrl=new Control();
		cntrl.start();
	}

}
