package com.hb.day26;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.plaf.SliderUI;

class Target{
	int cnt;
	
	public int func(){
		cnt++;
		return cnt;
	}
}

class Controller implements Runnable{
	Target target;
	
	public Controller(Target target) {
		this.target=target;
		
	}

	@Override
	public void run() {
		int cnt=0;
		Thread thr=Thread.currentThread();
		synchronized (this) {
			while(cnt<10){
				System.out.println(thr.getName());
					notify();// Blocked->Runnble
//				this.notifyAll();
				cnt=target.func();
				try {
					Thread.sleep(1000);
					this.wait();// Run -> Blocked
				} catch (InterruptedException e) {
				}
			}
		}
	}
	
}

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target target = new Target();
		Controller ctrll=new Controller(target);
		Thread thr1=new Thread(ctrll);
		Thread thr2=new Thread(ctrll);
		thr1.start();
		thr2.start();
	}

}
