package com.hb.day15;

abstract class Lec03{
	int su;
	
	void func01(){}
	
	// �޼����� private�� ��ӿ��� ��� ����
	// �������̵� �Ұ�
	private void func00(){}
	
	public abstract void func02();
	protected abstract void func03();
	abstract void func04();
//	private abstract void func05();
}

public class Ex03 extends Lec03{
	@Override
	void func01() {
	}
//	�Ұ�
//	@Override
//	void func00() {
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void func04() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void func03() {
		// TODO Auto-generated method stub
		
	}

}
