package com.hb.day13;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// ȸ������
		// ����Ͻ� ���̵�(Ư�����ڻ��Ұ�)>
		// ����Ͻ� �н�����(8���̻�16�̸�, ��,��,���� ����)>
		// �н����� ���Է�>
		// �������(ex.990101)>
		// ���̵�� ������ ���ϵ帳�ϴ�
		Scanner sc = new Scanner(System.in);
		String input="";
		String id=null;
		char[] ch;
		boolean chk1;
		// id chk;
		while(true){
		System.out.print("����Ͻ� ���̵�(Ư�����ڻ��Ұ�)>");
		input=sc.nextLine();
		ch=input.toCharArray();
			chk1=true;
			for(int i=0; i<ch.length; i++){
				if(!Character.isAlphabetic(ch[i])){
					if(!Character.isDigit(ch[i])){
						chk1=false;
					}
				}
			}
			if(chk1){
				id=input;
				break;
			}else{
				System.out.println("id�� Ư������ ��� �Ұ�");
			}
		}
		// pw chk;
		boolean[] chk2;
		while(true){
			System.out.print("����Ͻ� �н�����(4���̻�6�̸�, ��,��,���� ����)>");
			input=sc.nextLine();
			if(input.length()<4||input.length()>5){
				System.out.println("�н������ 4���̻�,6�ڹ̸��Դϴ�");
				continue;
			}
			ch=input.toCharArray();
			chk2=new boolean[]{false,false,false};
			for(int i=0; i<ch.length; i++){
				if(Character.isUpperCase(ch[i])){
					chk2[0]=true;
				}else if(Character.isLowerCase(ch[i])){
					chk2[1]=true;
				}else if(Character.isDigit(ch[i])){
					chk2[2]=true;
				}
			}
			System.out.println(chk2[0]+":"+chk2[1]+":"+chk2[2]);
			if(!(chk2[0]&&chk2[1]&&chk2[2])){
				System.out.println("�н������ ��,��,���� �������� �Է��ϼ���");
				continue;			
			}
			while(true){
				System.out.print("�н����� ���Է�>");
				if(input.equals(sc.nextLine())){
					break;
				}else{
					System.out.println("���Է� Ȯ��");
				}
			}
			break;
		}
		//�������
		boolean chk3;
		while(true){
			System.out.print("�������(ex.990101)>");
			input=sc.nextLine();
			chk3=true;
			ch=input.toCharArray();
			if(input.length()!=6){
				System.out.println("�Է� Ȯ��");
				continue;
			}
			for(int i=0; i<ch.length; i++){
				if(!Character.isDigit(ch[i])){
					chk3=false;
				}
			}
			if(chk3){
				break;
			}else{
				System.out.println("�Է� Ȯ��");
			}
		}

		System.out.println(id+"�� ������ ���ϵ帳�ϴ�");
	}

}














