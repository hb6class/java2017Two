package com.hb.day16;

interface Inter05{
	void func01();
}

class Lec05 implements Inter05{
	@Override
	public void func01() {
		System.out.println("상속으로 기능부여");
	}
}

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter05 inter01=new Inter05() {
			@Override
			public void func01() {
				System.out.println("기능");
			}
		};
		inter01.func01();
		
		Lec05 lec= new Lec05();
		lec.func01();
	};

}
