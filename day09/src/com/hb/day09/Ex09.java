package com.hb.day09;

import java.util.Scanner;

class Bank{
	String name;
	int money;
	
	public Bank(String msg) {
		name=msg;
	}
	
	void add(int a){
		money+=a;
	}
	
	boolean get(int a){
		boolean result=false;
		if(money>=a){
			money-=a;
			result=true;
		}
		return result;
		
	}
	void show(){
		System.out.println("�����ܰ�� "+money+"���Դϴ�");
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// �� ����CD
		// 1.�ܰ�Ȯ�� 2.�Ա� 3.��� 0.����
		int menu=0;
		int money=0;
		Bank hana = new Bank("��������");
		System.out.print("�������");
		System.out.println("-"+hana.name);
		while(true){
			System.out.print("1.�ܰ�Ȯ�� 2.�Ա� 3.��� 0.����>");
			menu=input();
			switch (menu) {
			case 2:
				System.out.print("�Ա��Ͻ� �ݾ��� �Է����ּ���>");
				money=input();
				hana.add(money);
				break;
			case 3:
				System.out.print("ã���� �ݾ��� �Է����ּ���");
				money=input();
				if(!hana.get(money)){
					System.out.println("�ܾ��� �����մϴ�");
				}
			case 1:
				hana.show();
				break;
			case 0:
				System.out.print("�̿����ּż� �����մϴ�");
				return;
	
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				System.out.println("�ٽ��ѹ�");
				break;
			}
		}
	}
	
	public static int input(){
		Scanner sc = new Scanner(System.in);
		String msg=sc.nextLine();
		return Integer.parseInt(msg);
	}

}











