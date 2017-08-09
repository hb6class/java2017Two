package com.hb.day08;

import java.util.Scanner;

class Student{
	public static int num=1700;
	public int kor=0;
	public int eng=0;
	public int math=0;
	
	public int sayTotal(){
		return kor+eng+math;
	}
	
	public double sayAvg(){
		return sayTotal()*100/3/100.0;
	}
	
}

public class Ex14 {

	public static void main(String[] args) {
		// 성적관리 프로그램 (ver 0.1.0)
		int cnt=0;
		Student stu;
		while(cnt<3){
			stu=new Student();
			Student.num++;
			stu.kor=input("국어");
			stu.eng=input("영어");
			stu.math=input("수학");
			
			System.out.println(stu.num+"학번의 총점:"+stu.sayTotal());
			System.out.println(stu.num+"학번의 평균:"+stu.sayAvg());
			cnt++;
		}
	}
	
	public static int input(String msg){
		Scanner sc=new Scanner(System.in);
		System.out.print(msg+":");
		String input=sc.nextLine();
		int su = Integer.parseInt(input);
		return su;
	}

}











