package com.hb.day26;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Thread thr1=new Thread(){
			@Override
			public void run() {
//				try {
//					this.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				for(int i=0; i<20000; i++){
					System.out.println(getName()+":"+i);
				}
			}
		};
		Thread thr2=new Thread(){
			@Override
			public void run() {
				for(int i=0; i<100; i++){
					System.out.println(getName()+":"+i);
				}
			}
		};
		thr1.start();
		thr2.start();
		try {
			thr1.join(1000);
			thr2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
