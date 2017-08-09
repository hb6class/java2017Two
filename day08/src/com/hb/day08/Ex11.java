package com.hb.day08;

public class Ex11 {

	public static void main(String[] args) {
		// 2의 제곱 수 중, 최초 1000을 넘는n=?
		int n=0;// 몇번돌까?
		int tot=1; // 제곱 수
		while(true){
			tot*=2;
			n++;
			if(tot>1000){
				break;
			}
		}
		System.out.println("n="+n);
	}

}
