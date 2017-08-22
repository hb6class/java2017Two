package com.hb.day20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Ball implements Comparable<Ball>{
	int num;
	public Ball(int num) {
		this.num=num;
	}
	@Override
	public int compareTo(Ball ball) {
		// TODO Auto-generated method stub
		return this.num-ball.num;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		// 자료구조를 사용한 
		// 로또번호생성기(ver 0.1.0)
		Set<Ball> lotto = new TreeSet<Ball>();
		while(lotto.size()<6){
			int su=(int)(Math.random()*45)+1;
			Ball ball = new Ball(su);
			lotto.add(ball);
		}
		
		Iterator<Ball> ite = lotto.iterator();
		while(ite.hasNext()){
			System.out.print(ite.next().num+" ");
		}
	}

}
