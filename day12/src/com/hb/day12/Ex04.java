package com.hb.day12;

public class Ex04 {
	static int a=100;//��������
	int b=200;

	public static void main(String[] args) {
		// ���� - �������� ��������
		// �������� > ��������
		int a=10;//��������
		System.out.println("a:"+Ex04.a);
		Ex04 me = new Ex04();
		me.func01(5);
	}
	
	void plus(int b){
		this.b=b;
	}
	
	public void func01(int b){
		System.out.println("b:"+this.b);
	}

}
