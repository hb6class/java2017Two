package com.hb.day09;

import java.util.Scanner;

public class Ex08 {
	static int su1;
	static int su2;
	static int su3;

	public static void main(String[] args) {
		// 가위, 바위, 보 게임
		// 1.가위 2.바위 3.보 0.종료>1
		// com : 바위
		// me : 가위
		// 졌습니다.
		// 1.가위 2.바위 3.보 0.종료>1
		// com : 보
		// me : 가위
		// 이겼습니다.
		// 1.가위 2.바위 3.보 0.종료>1
		// com : 가위
		// me : 가위
		// 비겼습니다.
		// 1.가위 2.바위 3.보 0.종료>0
		// 00승 00무 00패
		int com=0;// 1~3, 0~2+1
		int me=0;
		String input=null;
		Scanner sc = new Scanner(System.in);
		while(true){	
			System.out.print("1.가위 2.바위 3.보 0.종료>");
			com=(int)(Math.random()*3)+1;
			input=sc.nextLine();
			me=Integer.parseInt(input);
			if(me==0){
				System.out.println(su1+"승,"+su2+"무,"+su3+"패");
				System.out.println("감사합니다");
				return;
			}
			
			if(me==com){
				su2++;
				show(com,me);						
				System.out.println("비겼습니다");
			}else if((me==1&&com==2)||(me==2&&com==3)||(me==3&&com==1)){
				su3++;
				show(com,me);			
				System.out.println("졌습니다");
			}else if((me==1&&com==3)||(me==2&&com==1)||(me==3&&com==2)){
				su1++;
				show(com,me);
				System.out.println("이겼습니다");
			}else{
				System.out.println("입력범위는 0~3 사이입니다.");	
			}
		}
	}

	public static void show(int com, int me){
		if(com==1){
			System.out.print("컴퓨터:가위");
		}else if(com==2){
			System.out.print("컴퓨터:바위");
		}else if(com==3){
			System.out.print("컴퓨터:보");
		}
		System.out.print(", ");
		if(me==1){
			System.out.print("당신:가위");
		}else if(me==2){
			System.out.print("당신:바위");
		}else if(me==3){
			System.out.print("당신:보");
		}
		System.out.println();
	}
}









