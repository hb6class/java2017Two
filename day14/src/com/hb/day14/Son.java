package com.hb.day14;

public class Son extends Father {
	// ���
	// class Ŭ������ extends ��ӹ��� Ŭ������{}
	// ��, �ڹ� - ���߻��x
	// ��� - �ʵ�(static,non-static),�޼ҵ�(static,non-static)
	
	public int money=1234;
//	
//	public void getMoney(int money){
//		this.money-=money;
//	}
//	
//	public void putMoney(int money){
//		this.money+=money;
//	}
//	
	// �޼ҵ� �������̵�-������
	public void showMoney(){
		System.out.println("�ٲ�");
	}
	public void giveMe(int money){
		this.money-=money;
	}
	
	public boolean equals(Object obj) {
		
		return this.money==((Son)obj).money;
	}
	
	public void pocket(){
		System.out.println("�뵷�� "+money+"�� ���ҽ��ϴ�");
		System.out.println(su);
	}
}
