package com.hb.day09;

import java.util.Scanner;

public class Ex10 {
	static int milk;
	static int sugar;

	public static void main(String[] args) {
		// 
		// �������� ���α׷�(ver 0.0.1)
		// 
		//	���̽�ũ��(1ea) = ����(2ml) + ����(3g)
		//	���̽�ũ�� 1box = 20ea;
		//
		// 1.�԰�	2.���	3.���갡�ɼ���	0.����
		// >1
		// 1.���� 2.���� 0.�ڷ�
		// >2
		// 1.���� 2.���� 0.�ڷ�
		// >3
		// �� 00�ڽ� ���갡��(��ڽ����갡�� ����)
		int num=0;
		
		while(true){
			System.out.print("1.�԰� 2.��� 3.���갡�ɼ��� 0.����>");
			num=input();
			if(menu(num)){
				break;
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
	
	static void sec(int a){
		int num=0;
		System.out.print("1.���� 2.���� 0.�ڷ�>");
		num=input();
		if(a==1){
		menuOne(num,true);
		}else{
		menuOne(num,false);
		}
	}
	
	static void menuOne(int num, boolean tf){
		int su;
		switch (num) {
		case 1:
			System.out.print("����(ml)?");
			su=input();
			if(tf){milk+=su;}
			else{milk-=su;}
			break;
		case 2:
			System.out.print("����(g)?");
			su=input();
			if(tf){sugar+=su;}
			else{sugar-=su;}
			break;
			
		default:
			break;
		}
	}
	
	static boolean menu(int num){
		boolean end=false;
		switch (num) {
		case 0:
			end=true;
			break;
		case 1:
		case 2:
			sec(num);
			break;
		case 3:
			// ���갡�ɼ���
			show();
			break;

		default:
			System.out.println("�Է¿���");
			break;
		}
		return end;
	}
	static void show(){
		System.out.print("����"+milk);
		System.out.println(",����"+sugar);
	}
	
	static int input(){
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		int su = Integer.parseInt(msg);
		return su;
	}
}

















