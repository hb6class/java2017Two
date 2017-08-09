package com.hb.day09;

class Ex02 {
	int su=1111;
	String id="admin";
	String pw="1234";
	
	void func01(){
		func02();
		System.out.println("Ex02-func01"+id+pw);
	}
	void func02(){
		System.out.println("Ex02-func02");
	}
}
