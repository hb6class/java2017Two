package com.hb.day26;

public class Ex07 implements Runnable{
	

	public static void main(String[] args) {
		// 스케줄러
//		System.out.println(Thread.currentThread().getPriority());
		Ex07 me = new Ex07();
		Thread thr1 = new Thread(me,"thr1");
		Thread thr2 = new Thread(me,"thr2");
		thr1.setPriority(Thread.MIN_PRIORITY);	// 1~ 10사이, 상대적
		thr2.setPriority(Thread.NORM_PRIORITY); 	// 10(최고순위)~~~~1(최저순위)
//		//1:9
		thr1.start();
		thr2.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<100000; i++){
			System.out.print(Thread.currentThread().getPriority());
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
