package com.hb.day09;

import java.util.Scanner;

public class Ex08 {
	static int su1;
	static int su2;
	static int su3;

	public static void main(String[] args) {
		// ����, ����, �� ����
		// 1.���� 2.���� 3.�� 0.����>1
		// com : ����
		// me : ����
		// �����ϴ�.
		// 1.���� 2.���� 3.�� 0.����>1
		// com : ��
		// me : ����
		// �̰���ϴ�.
		// 1.���� 2.���� 3.�� 0.����>1
		// com : ����
		// me : ����
		// �����ϴ�.
		// 1.���� 2.���� 3.�� 0.����>0
		// 00�� 00�� 00��
		int com=0;// 1~3, 0~2+1
		int me=0;
		String input=null;
		Scanner sc = new Scanner(System.in);
		while(true){	
			System.out.print("1.���� 2.���� 3.�� 0.����>");
			com=(int)(Math.random()*3)+1;
			input=sc.nextLine();
			me=Integer.parseInt(input);
			if(me==0){
				System.out.println(su1+"��,"+su2+"��,"+su3+"��");
				System.out.println("�����մϴ�");
				return;
			}
			
			if(me==com){
				su2++;
				show(com,me);						
				System.out.println("�����ϴ�");
			}else if((me==1&&com==2)||(me==2&&com==3)||(me==3&&com==1)){
				su3++;
				show(com,me);			
				System.out.println("�����ϴ�");
			}else if((me==1&&com==3)||(me==2&&com==1)||(me==3&&com==2)){
				su1++;
				show(com,me);
				System.out.println("�̰���ϴ�");
			}else{
				System.out.println("�Է¹����� 0~3 �����Դϴ�.");	
			}
		}
	}

	public static void show(int com, int me){
		if(com==1){
			System.out.print("��ǻ��:����");
		}else if(com==2){
			System.out.print("��ǻ��:����");
		}else if(com==3){
			System.out.print("��ǻ��:��");
		}
		System.out.print(", ");
		if(me==1){
			System.out.print("���:����");
		}else if(me==2){
			System.out.print("���:����");
		}else if(me==3){
			System.out.print("���:��");
		}
		System.out.println();
	}
}









