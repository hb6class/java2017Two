package com.hb.day09;

class Ex66{
	int a=0;
//	public Ex66() {}
//	Ex66(int b){
//		System.out.println("��ü ����"+b);
//		a=b;
//	}
//	Ex66(int b, String msg){
//		System.out.println(msg+"��ü ����"+b);
//		a=b;
//	}
	
	int su;
	
	void func01(){
		System.out.println("func01 a:"+a);
		
	}
	static void func02(){
		System.out.println("func02");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		// Ŭ���� �⺻�������
		// 1. �޼���(static, non-static)
		// 2. �ʵ�(static, non-static)
		// 3. ������
		// �ʵ尪�� �ʱ�ȭ
		
		Ex66 ex66 = new Ex66();
//		ex66.Ex66();
		ex66.func01();
//		Ex66.func02();
	}

}
