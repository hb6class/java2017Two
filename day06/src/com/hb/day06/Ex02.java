package com.hb.day06;

import java.util.Scanner;

public class Ex02 {
	// Ŭ���� �������
	// 1. �޼���
	// 2. �ʵ�
	// 	���� �ʱ�ȭ ����
	//  or ���� - �⺻��
	// ���� - 0;
	// �Ǽ� - 0.0;
	// boolean - false;
	// char - '/u0000'
	
	public static int a;
	public static int b;
	public static int c;
	

	public static void main(String[] args) {
		// 3���� ���� �Է¹ް�
		// �̵��� �������� �����Ͻÿ�
		// 1��°>7
		// 2��°>9
		// 3��°>5
		// ���> 5<7<9
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��°:");
		String input1=sc.nextLine();
		System.out.print("�ι�°:");
		String input2=sc.nextLine();
		System.out.print("����°:");
		String input3=sc.nextLine();
		int su1=Integer.parseInt(input1);
		int su2=Integer.parseInt(input2);
		int su3=Integer.parseInt(input3);
		a=su1;
		b=su2;
		c=su3;
		sort();
		System.out.println(a+"<"+b+"<"+c);
	}
	
	public static void sort(){
		int tmp=0;
		int tmp2=0;
		if(a<b && a<c){
			//�������� a
			if(b<c){
				
			}else if(c<b){
				tmp=b;
				b=c;
				c=tmp;
			}
		}else if(b<a && b<c){
			//�������� b
			tmp=a;
			a=b;
			if(tmp<c){
				b=tmp;
			}else if(c<tmp){
				b=c;
				c=tmp;
			}
		}else if(c<a && c<b){
			//�������� c
			tmp=a;
			a=c;
			if(a<b){
				tmp2=b;
				b=tmp;
				c=tmp2;
			}else if(b<a){
				c=tmp;
			}
		}
	}
}













