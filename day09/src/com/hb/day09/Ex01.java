package com.hb.day09;

import com.hb.ex.Ex03;
import com.hb.ex.*;

class Ex011{
	// ��ü�� ǥ��
	// �������� - �Ӽ�
	// �޼��� - ���
	void func01(){}
}

class Ex01 {

	public static void main(String[] args) {
		// ����������
		// public(���) > default(���� ��Ű�� ����) > private(����Ŭ���� ����)
		// Ŭ����, ��������, �޼��� ��� ����
		// ��, Ŭ���� private �Ұ�
		
		com.hb.day09.Ex011 ex1=new Ex011();
		ex1.func01();
		Ex02 ex2=new Ex02();
		ex2.func01();
//		System.out.println(ex2.id);
		Ex03 ex3 = new Ex03();
		ex3.func01();
		Ex04 ex4=new Ex04();
//		ex4.func01();
	}

}













