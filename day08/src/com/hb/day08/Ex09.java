package com.hb.day08;

public class Ex09 {

	public static void main(String[] args) {
		// 5+4+3+2+1=????(메소드-int sum=func(5);)
		System.out.println(tot(31));
	}
	public static int tot(int start){
		// 재귀함수 - 자신을 재호출
		if(start==1){
			return 1;
		}else{
			return start+tot(--start);
		}
	}

}
