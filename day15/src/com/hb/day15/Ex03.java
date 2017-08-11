package com.hb.day15;

abstract class Lec03{
	int su;
	
	void func01(){}
	
	// 메서드의 private은 상속에서 대상 제외
	// 오버라이드 불가
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
//	불가
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
