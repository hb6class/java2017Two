package com.hb.day09;

public class Ex07 {
	//
	//속성 ~ 단어
	//기능 ~ 동사
	//
	static int num;
	int kor;
	int eng;
	int math;
	
	Ex07(int a, int b, int c){
		kor=a;
		eng=b;
		math=c;
		num++;
	}
	Ex07(int d, int a, int b, int c){
		num=d;
		kor=a;
		eng=b;
		math=c;
	}
	
	int sum(){
		return kor+eng+math;
	}
	
	double avg(){
		return sum()*100/3/100.0;
	}
	
	static int input(String name){
		java.io.InputStream inn = System.in;
		java.util.Scanner sc = new java.util.Scanner(inn);
		System.out.print(name+">");
		String msg=sc.nextLine();
		int su=Integer.parseInt(msg);
		return su;
	}

	public static void main(String[] args) {
		// 학생 성적관리 프로그램(ver 0.2.1)
		Ex07 stu;
		boolean one=true;
		while(true){
			if(one){
				stu = new Ex07(input("학번"),input("국어")
						, input("영어"), input("수학"));
				one=false;
			}else{
				stu = new Ex07(input("국어"), input("영어")
						, input("수학"));
			}
		System.out.println("------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t합계\t평균");
		System.out.println("------------------------------------");
		System.out.print(stu.num);
		System.out.print("\t");
		System.out.print(stu.kor);
		System.out.print("\t");
		System.out.print(stu.eng);
		System.out.print("\t");
		System.out.print(stu.math);
		System.out.print("\t");
		System.out.print(stu.sum());
		System.out.print("\t");
		System.out.println(stu.avg());
		System.out.println("------------------------------------");
		int su = input("1.계속 0.종료");
			if(su==0){
				break;
			}
		}
		
		
	}

}









