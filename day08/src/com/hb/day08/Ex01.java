package com.hb.day08;

public class Ex01 {
	// �޼��� - static , non-static

	public static void main(String[] args) {
		// non-static method
		// static method���ο��� non-static methodȣ����
		// Ŭ������ ���������� = new Ŭ������();����
		// �������� ������ ��������.�޼����();���� ����
		// non-static method -> non-static method
		// non-static method -> static method
		// �޼����();
		
		int a=func01();
		System.out.println(a);
		
//		Ex01 ex01 = new Ex01();
		Ex01 ex01;	// ���������� ����
		ex01= new Ex01(); 
		// ��ü�� �����ؼ�
		// ex01 ���������� ����
//		ex01.func02(); // ��������.�޼����
//		ex01.func02(1111);
		System.out.println(ex01.func03());
		ex01.func04();
	}
	
	public static int func01(){
		Ex01 ex02=new Ex01();
		ex02.func02();
		return 100;
	}
	
	public void func04(){
		func01();
	}
	
	public void func02(){
		System.out.println("func02 ����");
	}
	public void func02(int a){
		System.out.println("���޹��� ����"+a);
	}
	public int func03(){
		return 3333;
	}
}
