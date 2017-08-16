package com.hb.day18.am;

enum Lecture{
	JAVA,DB,WEB,ANDROID
}

public class Ex07 {
	final String[] lecture={"java","DB","web","android"};
	final String JAVA="java";
	final String DB="DB";
	final String WEB="web";
	final String ANDROID="android";
	
	public void func3(Lecture msg){
		if(msg.equals(Lecture.JAVA)){
			System.out.println("현재수업은"+Lecture.JAVA);
		}else if(msg.equals(Lecture.DB)){
			System.out.println("현재수업은"+Lecture.DB);
		}else if(msg.equals(Lecture.WEB)){
			System.out.println("현재수업은"+Lecture.WEB);
		}else if(msg.equals(Lecture.ANDROID)){
			System.out.println("현재수업은"+Lecture.ANDROID);
		}
		
	}
	public void func2(String msg){
		lecture[0]="JaVa";
		if(msg.equals(lecture[0])){
			System.out.println("현재수업은"+lecture[0]);
		}else if(msg.equals(lecture[1])){
			System.out.println("현재수업은"+lecture[1]);
		}else if(msg.equals(lecture[2])){
			System.out.println("현재수업은"+lecture[2]);
		}else if(msg.equals(lecture[3])){
			System.out.println("현재수업은"+lecture[3]);
		}
		
	}
	public void func(String msg){
		if(msg.equals(JAVA)){
			System.out.println("현재수업은"+JAVA);
		}else if(msg.equals(DB)){
			System.out.println("현재수업은"+DB);
		}else if(msg.equals(WEB)){
			System.out.println("현재수업은"+WEB);
		}else if(msg.equals(ANDROID)){
			System.out.println("현재수업은"+ANDROID);
		}
		
	}

	public static void main(String[] args) {
		// 열거형
		// 수업들
		Ex07 me = new Ex07();
		me.func3(Lecture.JAVA);
	}

}
