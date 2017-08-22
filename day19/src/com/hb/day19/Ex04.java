package com.hb.day19;

import java.util.LinkedList;

public class Ex04 {

	public static void main(String[] args) {
		// Queue - a first-in-first-out (FIFO)
		// FIFO - 선입선출
		java.util.Queue que=new LinkedList();
		que.offer(11111);
		que.offer(22222);
		que.offer(33333);
		que.offer(44444);
		
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		System.out.println("--------------------------");
		System.out.println(que.peek());
		System.out.println("--------------------------");
		System.out.println(que.poll());
		System.out.println(que.poll());
	}

}
