package com.hb.day15;

import java.util.Scanner;

class Student{
	int kor;
	int eng;
	int math;
	
	public Student(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public int sum(){
		return kor+eng+math;
	}
	public double avg(){
		return sum()*100/3/100.0;
	}
}

public class Ex07 {
	static Student[] stu;
	static int cnt=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg=input("test");
//		if(inputChk(msg)){
//			System.out.println("0~2사이");
//		}else{
//			System.out.println("입력오류");			
//		}
		String menu=null;
		System.out.println("학생성적관리프로그램(ver 0.3.0)");
		while(true){
			menu=input("1.성적입력 2.성적출력 0.종료");
			if(!inputChk(menu)){
				System.out.println("[입력오류]메뉴 확인 후 입력하세요");
				continue;
			}
			if(menu.equals("0")){
				break;
			}else if(menu.equals("1")){
				add();
			}else{
				show();
			}
		
		}
	}
	
	public static void add(){
		cnt++;
		Student[] tmp=null;
		if(cnt!=1){
		tmp=new Student[stu.length];
		System.arraycopy(stu, 0, tmp, 0, tmp.length);
		}
		// 처음
		stu=new Student[cnt];
		String msg=input("국어");
		
		int kor=0;
		if(stuChk(msg)){
			kor=Integer.parseInt(msg);
		}else{
			cnt--;
			return;
		}
		msg=input("영어");
		int eng =0;
		if(stuChk(msg)){
			eng=Integer.parseInt(msg);
		}else{
			cnt--;
			return;
		}
		msg=input("수학");
		int math =0;
		if(stuChk(msg)){
			math=Integer.parseInt(msg);
		}else{
			cnt--;
			return;
		}
		
		stu[cnt-1]=new Student(kor,eng,math);
		if(cnt!=1){System.arraycopy(tmp, 0, stu, 0, tmp.length);}
		
	}
	public static void show(){
		if(stu==null){
			System.out.println("학생없음");
			return;
		}
		System.out.println("-----------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		for(int i=0; i<stu.length; i++){
			System.out.print(i+1);
			System.out.print("\t");
			System.out.print(stu[i].kor);
			System.out.print("\t");
			System.out.print(stu[i].eng);
			System.out.print("\t");
			System.out.print(stu[i].math);
			System.out.print("\t");
			System.out.print(stu[i].sum());
			System.out.print("\t");
			System.out.println(stu[i].avg());
		}
		System.out.println("-----------------------------------------");
	}
	
	public static String input(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(msg+">");
		return sc.nextLine().trim();
	}
	
	public static boolean stuChk(String msg){
		// 0~100
		char[] ch=msg.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(!Character.isDigit(ch[i])){
				return false;
			}
		}
		if(ch.length<1||ch.length>3){}
		if(ch.length==3){
			if(!(ch[0]=='1'&&ch[1]=='0'&&ch[2]=='0')){
				return false;
			}
		}
		return true;
	}
	public static boolean inputChk(String msg){
		// 0~2까지
		if((msg.length()>1||msg.length()<1)
			||(!Character.isDigit(msg.charAt(0)))
			||(msg.charAt(0)>'2')){
			return false;						
		}
		return true;
	}

}











