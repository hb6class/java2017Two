package com.hb.day22;

import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date date= new Date();
		System.out.println(date);
		
		// ��
		// �� 0~11 
		date= new Date(2017-1900,8-1,22);
		System.out.println(date);
		date= new Date(2017-1900,8-1,22,11,25,50);
		System.out.println(date);
		date= new Date(System.currentTimeMillis());
		System.out.println(date);
		date= new Date(2017-1900,11,25,13,30);
		int h=date.getHours();
		System.out.println(h);
		int m=date.getMinutes();
		System.out.println(m);
		int s=date.getSeconds();
		System.out.println(s);
		int y=date.getYear();
		System.out.println(y+1900);
		int mm=date.getMonth();
		System.out.println(mm+1);
		int d=date.getDate();
		System.out.println(d);
		int w=date.getDay();
		System.out.println(w);
		date.setYear(118);
		date.setMonth(0);
		date.setDate(1);
		switch (w) {
		case 0:
			System.out.println("�Ͽ���");
			break;
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("ȭ����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("�ݿ���");
			break;
		case 6:
			System.out.println("�����");
			break;

		default:
			break;
		}
	}

}









