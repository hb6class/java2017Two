package com.hb.day16;

class Lec06{
	
	public Lec06() {
		// TODO Auto-generated constructor stub
	}
	public void func01(){}
	public void func02(){}
}

class Lec66 extends Lec06{

	@Override
	public void func02() {
		// TODO Auto-generated method stub
	}
}

interface Inter06{
	void func03();
}

class Lec666 implements Inter06{
	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}
}

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Inter06(){
//			@Override
//			public void func03() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		new Lec06(){
			@Override
			public void func02(){
				
			}
		}.func02();
	}

}
