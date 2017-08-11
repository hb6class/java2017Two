package com.hb.day15;

interface Lec04{
	public final int su=100;
	final int su1=100;
	public int su2=100;
	int su3=100;
	
	public abstract void func01();
	public void func02();
	void func03();
}

interface Lec444 extends Lec04{
	static int su3=200;
	void func04();
}

interface Lec44 extends Lec04,Lec444{
	void func03();
	void func04();
}

class Ex44{}
class Ex444{}

public class Ex04 extends Ex44 implements Lec44{

	public static void main(String[] args) {
		Ex04 me = new Ex04();
//		me.su3++;
		System.out.println(Lec444.su3);

	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func04() {
		// TODO Auto-generated method stub
		
	}

}
