package com.hb.day17;

class Lec01 extends Object{
	public Lec01() {
		// TODO Auto-generated constructor stub
	}
	
	public Lec01(int a) {
		
	}
	
}

public class Ex01 extends Lec01{
	int su=1234;

	public Ex01() {
//		super(100);
		this(100);
		System.out.println("����Ʈ ������"+su);
	}
	public Ex01(int a){
//		super(a);
		System.out.println("��������(int) ������"+su);
	}
	public Ex01(double a){
//		super((int)a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01 me = new Ex01(); 
	}

}
