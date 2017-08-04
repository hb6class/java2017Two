package com.hb.day11;

class Ball{
	int num;
	boolean chk;
	String color;
	
	public Ball(int a) {
		num=a;
		chk=false;
		switch ((a-1)/10) {
		case 0:
			color="빨강";
			break;
		case 1:
			color="파랑";
			break;
		case 2:
			color="노랑";
			break;

		default:
			color="검정";
			break;
		}
	}
}

public class Ex12 {

	public static void main(String[] args) {
		// 로또
		Ball[] box = new Ball[45]; 
		Ball[] result=new Ball[6];
		int ran=0;
		for(int i=0; i<box.length; i++){
			box[i]=new Ball(i+1);
		}
		
		for(int i=0; i<6; i++){
			// box의 index 이기에 0 ~ 44
			ran=(int)(Math.random()*45);
			if(box[ran].chk){
				// 다시 뽑기
				i--;
				continue;
			}else{
				// 뽑았으나 마킹
				box[ran].chk=true;
			}
			result[i]=box[ran];
		}
		show(result);
	}

	public static void show(Ball[] result){
		for(int i=0; i<result.length; i++){
			if(i==0){System.out.print("당첨번호는 ");}
			System.out.print(result[i].color+"색 공 ");
			System.out.print(result[i].num+"번");
			if(i==result.length-1){
				System.out.println("입니다");
				System.out.println("축하합니다");
			}else{
				System.out.print("\n,");
			}
		}
	}
}













