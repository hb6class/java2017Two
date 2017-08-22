package com.hb.day19;

import java.util.Stack;

public class Ex03 {

	public static void main(String[] args) {
		// Stack - a last-in-first-out (LIFO)
		//LIFO - 후입선출
		java.util.Stack stk=new Stack();
		stk.push(1111);
		stk.push(2222);
		stk.push(3333);
		stk.push(4444);
		System.out.println(stk.peek());
		System.out.println("------------------");
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		
		
		
	}

}
