package com.hb.day07;

public class Ex06 {

	public static void main(String[] args) {
		// 학생성적관리 합계 평균 학점
		int kor=60;
		int eng=70;
		int math=80;
		
		int sum=kor+eng+math;
		double avg=sum/3.0;
		System.out.println("국어\t영어\t수학\t합계\t평균\t학점");
		System.out.print(kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg);
		System.out.print("\t");
		
		if(avg>=90){
			System.out.println("A학점");
		}else if(avg>=80){
			System.out.println("B학점");
		}else if(avg>=70){
			System.out.println("C학점");
		}else if(avg>=60){
			System.out.println("D학점");			
		}else{
			System.out.println("F학점");			
		}
		
		
		
		
		System.out.println("-------------------------------");
		System.out.println("영수증");
		System.out.println("-------------------------------");
		
		System.out.println("상품명\t\t가격\t수량\t합계");
		System.out.println("새우과자\t1000\t1\t"+(1000*1));
		System.out.println("생수\t\t500\t2\t"+(500*2));
		System.out.println("껌\t\t300\t3\t"+(300*3));
		System.out.println("-------------------------------");
		
		
	}

}






