package com.hb.day08;

public class Ex01 {
	// 메서드 - static , non-static

	public static void main(String[] args) {
		// non-static method
		// static method내부에서 non-static method호출은
		// 클래스명 참조변수명 = new 클래스명();으로
		// 참조변수 생성후 참조변수.메서드명();으로 실행
		// non-static method -> non-static method
		// non-static method -> static method
		// 메서드명();
		
		int a=func01();
		System.out.println(a);
		
//		Ex01 ex01 = new Ex01();
		Ex01 ex01;	// 참조변수의 선언
		ex01= new Ex01(); 
		// 객체를 생성해서
		// ex01 참조변수에 대입
//		ex01.func02(); // 참조변수.메서드명
//		ex01.func02(1111);
		System.out.println(ex01.func03());
		ex01.func04();
	}
	
	public static int func01(){
		Ex01 ex02=new Ex01();
		ex02.func02();
		return 100;
	}
	
	public void func04(){
		func01();
	}
	
	public void func02(){
		System.out.println("func02 실행");
	}
	public void func02(int a){
		System.out.println("전달받은 수는"+a);
	}
	public int func03(){
		return 3333;
	}
}
