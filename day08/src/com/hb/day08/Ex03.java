package com.hb.day08;

public class Ex03 {
	public static int su1=100;
	public int su2=200;

	public static void main(String[] args) {
		// Ŭ������ �������
		// 1.�޼��� 
		//	1-1. static
		//	1-2. non-static - ����޼���, non-static�޼���
		// 2. ��������
		//	2-1. static - Ŭ��������
		//	2-2. non-static - �ɹ��ʵ�, non-static����
		System.out.println("su1="+su1);
		Ex03 me = new Ex03();
		System.out.println("su2="+me.su2);
	}
	
	public void func01(){
		int a=100;
		// ��������
		System.out.println("f1="+su1);
		System.out.println("f2="+su2);
	}

}
