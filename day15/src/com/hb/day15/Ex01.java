package com.hb.day15;

abstract class Lec01{
	//�߻�Ŭ����
	//�߻�޼��带 ���� Ŭ����
	//�߻�Ŭ���� - �߻�޼��� 0�� �̻� ����
	//�Ϲ������� ��ü�� ������ �Ұ�
	//�Ϲ������� ���� - ����� �������� 
	int su;
	
	public Lec01() {
	}
	
	void func01(){
		System.out.println("Lec01-func01()");
	}
	//�߻�޼���-abstract-�޼����� ����,����x
	abstract void func02();
	
}

public class Ex01 extends Lec01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lec01 lec = new Lec01();
//		lec.func02();
		System.out.println("test");
		Ex01 me = new Ex01();
		
	}

	@Override
	void func02() {
		// TODO Auto-generated method stub
		
	}

}









