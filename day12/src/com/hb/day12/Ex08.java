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
		// �л������������α׷�(ver 0.2.2)
		// �ѿ���>5
		// �⵵>2017
		// 1.�����Է� 2.������� 0.����>1
		// ����>
		// ����>
		// ����>
		// 1.�����Է� 2.������� 0.����>2
		// �й�		����	����	����	����	���	����
		// -----------------------------------------------------
		// 1701		90		90		90		270		90		A
		// 1702		90		90		90		270		90		A
		// 1703		90		90		90		270		90		A
		// 1704		90		90		90		270		90		A
		// 1705		90		90		90		270		90		A
		// 1.�����Է� 2.������� 0.����>0
		// �̿����ּż� �����մϴ�
		int tot=input("�ѿ� ��>");
		int year=input("�ش�⵵>")-2000;
		int num=1;
		int menu=0;
		int cnt=0;
		Student[] stus= new Student[tot];
		while(true){
			menu=input("1.�����Է� 2.������� 0.����>");
			if(menu==0){
				break;
			}else if(menu==1){
				stus[cnt]=new Student(year*100+num++);
				stus[cnt].kor=input("����>");
				stus[cnt].eng=input("����>");
				stus[cnt].math=input("����>");
				cnt++;
			}else if(menu==2){
				System.out.println("�й�\t����\t����\t����");
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








