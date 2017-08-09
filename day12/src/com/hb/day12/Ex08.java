package com.hb.day12;

import java.util.Scanner;

class Student{
	private int num;
	int kor;
	int eng;
	int math;
	public Student(int num) {
		this.num = num;
	}
	public int sayNum(){
		return num;
	}
}

public class Ex08 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.2.2)
		// 총원수>5
		// 년도>2017
		// 1.성적입력 2.성적출력 0.종료>1
		// 국어>
		// 영어>
		// 수학>
		// 1.성적입력 2.성적출력 0.종료>2
		// 학번		국어	영어	수학	총점	평균	학점
		// -----------------------------------------------------
		// 1701		90		90		90		270		90		A
		// 1702		90		90		90		270		90		A
		// 1703		90		90		90		270		90		A
		// 1704		90		90		90		270		90		A
		// 1705		90		90		90		270		90		A
		// 1.성적입력 2.성적출력 0.종료>0
		// 이용해주셔서 감사합니다
		int tot=input("총원 수>");
		int year=input("해당년도>")-2000;
		int num=1;
		int menu=0;
		int cnt=0;
		Student[] stus= new Student[tot];
		while(true){
			menu=input("1.성적입력 2.성적출력 0.종료>");
			if(menu==0){
				break;
			}else if(menu==1){
				stus[cnt]=new Student(year*100+num++);
				stus[cnt].kor=input("국어>");
				stus[cnt].eng=input("영어>");
				stus[cnt].math=input("수학>");
				cnt++;
			}else if(menu==2){
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("---------------------------------------");
				for(int i=0; i<cnt; i++){
					System.out.print(stus[i].sayNum());
					System.out.print("\t");
					System.out.print(stus[i].kor);
					System.out.print("\t");
					System.out.print(stus[i].eng);
					System.out.print("\t");
					System.out.println(stus[i].math);
				}
				System.out.println("---------------------------------------");
			}
			
		}
	}
	
	static int input(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		String tmp=sc.nextLine();
		int su=Integer.parseInt(tmp);
		
		return su;
	}
}








