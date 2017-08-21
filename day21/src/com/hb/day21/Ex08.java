package com.hb.day21;

import java.util.ArrayList;
import java.util.Scanner;

class MyErr extends Exception{
	public MyErr(String msg) {
		super(msg);
	}
}

class Student{
	int num;
	int kor,eng,math;
	
	Student(int num, int kor, int eng, int math){
		this.num=num;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}
public class Ex08 {
	private static ArrayList<Student> list = new ArrayList<Student>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 성적관리프로그램(ver 0.3.0)
		// 컬렉션 프레임워크 이용
		// ArrayList
		System.out.println("성적관리프로그램(ver 0.3.0)");
		int mn=0;
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			try {
				mn=menuInput(sc);
			} catch (MyErr e) {
				System.out.println(e.getMessage());
				continue;
			}
			if(mn==0){break;}
			if(mn==1){listView();}
			if(mn==2){
				try {
					listAdd(sc);
				} catch (MyErr e) {
					System.out.println(e.getMessage());
					continue;
				}
			}
			if(mn==3){
				try {
					listEdit(sc);
				} catch (MyErr e) {
					System.out.println(e.getMessage());
					continue;
				}
			}
			if(mn==4){
				try {
					listDel(sc);
				} catch (MyErr e) {
					System.out.println(e.getMessage());
					continue;
				}
			}
		}
		System.out.println("감사합니다");
	}
	
	static void listDel(Scanner sc) throws MyErr{
		int idx;
		try{
			System.out.print("삭제할 학번>");
			idx=Integer.parseInt(sc.nextLine());
		}catch(Exception e){
			throw new MyErr("숫자로입력");
		}
		int i=0;
		Student stu=null;
		for(i=0; i<list.size(); i++){
			stu=list.get(i);
			if(stu.num==idx){
				break;
			}
		}
		if(i==list.size()){
			throw new MyErr(idx+"학번이 존재하지 않습니다");
		}
		list.remove(i);
	}
	
	static void listEdit(Scanner sc) throws MyErr{
		int idx;
		try{
			System.out.print("수정할 학번>");
			idx=Integer.parseInt(sc.nextLine());
		}catch(Exception e){
			throw new MyErr("숫자로입력");
		}
		int i;
		Student stu=null;
		for(i=0; i<list.size(); i++){
			stu=list.get(i);
			if(stu.num==idx){
				break;
			}
		}
		if(i==list.size()){
			throw new MyErr(idx+"학번 학생 존재하지 않음");
		}
		try{
			System.out.print("국어("+stu.kor+"):");
			int kor=Integer.parseInt(sc.nextLine());
			System.out.print("영어("+stu.eng+"):");
			int eng=Integer.parseInt(sc.nextLine());
			System.out.print("수학("+stu.math+"):");
			int math=Integer.parseInt(sc.nextLine());
			stu=new Student(idx, kor, eng, math);
			list.set(i,stu);
		}catch(Exception ex){
			throw new MyErr("숫자입력");
		}
	}
	
	static void listAdd(Scanner sc) throws MyErr{
		try{
		System.out.print("학번:");
		int num=Integer.parseInt(sc.nextLine());
		System.out.print("국어:");
		int kor=Integer.parseInt(sc.nextLine());
		System.out.print("영어:");
		int eng=Integer.parseInt(sc.nextLine());
		System.out.print("수학:");
		int math=Integer.parseInt(sc.nextLine());
		list.add(new Student(num, kor, eng, math));
		}catch(Exception ex){
			throw new MyErr("숫자입력");
		}
	}
	
	static void listView(){
		System.out.println("---------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t합계\t평균");
		System.out.println("---------------------------------------");
		for(Student stu : list){
			System.out.print(stu.num);
			System.out.print('\t');
			System.out.print(stu.kor);
			System.out.print('\t');
			System.out.print(stu.eng);
			System.out.print('\t');
			System.out.print(stu.math);
			System.out.print('\t');
			System.out.println();
		}
		System.out.println("---------------------------------------");
	}
	
	static int menuInput(Scanner sc) throws MyErr{
		String input=sc.nextLine();
		
		if(input.length()<1 || input.length()>1){
			throw new MyErr("입력을 확인하세요");
		}else if(input.charAt(0)<'0'||input.charAt(0)>'4'){
			throw new MyErr("0~4 사이값을 입력하세요");			
		}
		return Integer.parseInt(input);
	}

}





