package com.hb.day26;



public class Ex10 implements Runnable{
	static int tot=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex10 me = new Ex10();
		Thread thr1=new Thread(me);
		Thread thr2=new Thread(me);
//		thr1.run();
//		thr2.run();
		thr1.start();
		thr2.start();
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(me.tot);
	}
	
//	public synchronized void sum(int su){
	public void sum(int su){
		// 임계영역
		// 	synchronized되면 오직 하나의 스레드만 실행가능
//			tot+=su;
			//....
		synchronized (this) {
			int tmp=tot+su;
			tot=tmp;			
		}
			//....
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10000; i++){
			sum(i);
		}
	}

}
