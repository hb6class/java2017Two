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
		// �����������α׷�(ver 0.3.0)
		// �÷��� �����ӿ�ũ �̿�
		// ArrayList
		System.out.println("�����������α׷�(ver 0.3.0)");
		int mn=0;
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
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
		System.out.println("�����մϴ�");
	}
	
	static void listDel(Scanner sc) throws MyErr{
		int idx;
		try{
			System.out.print("������ �й�>");
			idx=Integer.parseInt(sc.nextLine());
		}catch(Exception e){
			throw new MyErr("���ڷ��Է�");
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
			throw new MyErr(idx+"�й��� �������� �ʽ��ϴ�");
		}
		list.remove(i);
	}
	
	static void listEdit(Scanner sc) throws MyErr{
		int idx;
		try{
			System.out.print("������ �й�>");
			idx=Integer.parseInt(sc.nextLine());
		}catch(Exception e){
			throw new MyErr("���ڷ��Է�");
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
			throw new MyErr(idx+"�й� �л� �������� ����");
		}
		try{
			System.out.print("����("+stu.kor+"):");
			int kor=Integer.parseInt(sc.nextLine());
			System.out.print("����("+stu.eng+"):");
			int eng=Integer.parseInt(sc.nextLine());
			System.out.print("����("+stu.math+"):");
			int math=Integer.parseInt(sc.nextLine());
			stu=new Student(idx, kor, eng, math);
			list.set(i,stu);
		}catch(Exception ex){
			throw new MyErr("�����Է�");
		}
	}
	
	static void listAdd(Scanner sc) throws MyErr{
		try{
		System.out.print("�й�:");
		int num=Integer.parseInt(sc.nextLine());
		System.out.print("����:");
		int kor=Integer.parseInt(sc.nextLine());
		System.out.print("����:");
		int eng=Integer.parseInt(sc.nextLine());
		System.out.print("����:");
		int math=Integer.parseInt(sc.nextLine());
		list.add(new Student(num, kor, eng, math));
		}catch(Exception ex){
			throw new MyErr("�����Է�");
		}
	}
	
	static void listView(){
		System.out.println("---------------------------------------");
		System.out.println("�й�\t����\t����\t����\t�հ�\t���");
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
			throw new MyErr("�Է��� Ȯ���ϼ���");
		}else if(input.charAt(0)<'0'||input.charAt(0)>'4'){
			throw new MyErr("0~4 ���̰��� �Է��ϼ���");			
		}
		return Integer.parseInt(input);
	}

}





