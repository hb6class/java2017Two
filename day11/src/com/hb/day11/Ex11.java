package com.hb.day11;

import java.util.Scanner;

class Factory{
	int milk;
	int sugar;
	
	void plusMilk(int a){
		milk+=a;
	}
	void plusSugar(int a){
		sugar+=a;
	}
	void minusMilk(int a){
		if(milk-a>=0){
			milk-=a;
		}
	}
	void minusSugar(int a){
		if(sugar-a>=0){
			sugar-=a;
		}
	}
	int createBox(){
		// 2x:3y=100:??
		
//		milk*2 sugar*3
		int ea=0;
		int tmp1=milk/2;//66
		int tmp2=sugar/3;//150
		if(tmp1<tmp2){
			ea=tmp1;
		}else{
			ea=tmp2;
		}
		System.out.print("����:"+milk);
		System.out.print("����:"+sugar+"�� ");
		System.out.println(ea+"�� ���갡���ϰ�");
		return ea/20;
	}
	
}

public class Ex11 {

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
		Factory fac=new Factory();
		int inn=0;
		while(true){
			System.out.print("1.�԰� 2.��� 3.���갡�ɼ��� 0.����>");
			inn=input();
			switch (inn) {
			case 1:
				System.out.println("1.���� 2.���� 0.�ڷ�>");
				inn=input();
				if(inn==1){
					fac.plusMilk(input());
				}else if(inn==2){
					fac.plusSugar(input());
				}
				break;
			case 2:
				System.out.println("1.���� 2.���� 0.�ڷ�>");
				inn=input();
				if(inn==1){
					fac.minusMilk(input());
				}else if(inn==2){
					fac.minusSugar(input());
				}
				break;
			case 3:
				System.out.println("�� �����δ� "+fac.createBox()+"box ���갡���մϴ�");
				break;
			case 0:
				System.out.println("�����մϴ�");
				return;
			default:
				break;
			}
		}

	}
	public static int input(){
		Scanner sc=new Scanner(System.in);
		String tmp=sc.nextLine();
		return Integer.parseInt(tmp);
	}

}
