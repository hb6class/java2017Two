package com.hb.day10;

public class Lotto {

	public static void main(String[] args) {
		// 로또번호 생성기
		// 1.로또번호는 랜덤
		// 2.로또번호는 중복
		// 3.오름차순 정렬
		// 7, 1, 5, 10, 24, 21 +보너스번호
		int[] balls=new int[45];
		for(int i=0; i<balls.length; i++){
			balls[i]=i+1;
		}
		int ran=0;
		int tmp=0;
		for(int i=0; i<10000; i++){
			tmp=balls[0];
			ran=(int)(Math.random()*44)+1;
			balls[0]=balls[ran];
			balls[ran]=tmp;
		}
		
		int[] result = new int[6];
		for(int i=0; i<6; i++){
			result[i]=balls[i];
//			System.out.print(balls[i]+" ");
		}
	}
	
}
