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
			System.out.println("���������"+Lecture.JAVA);
		}else if(msg.equals(Lecture.DB)){
			System.out.println("���������"+Lecture.DB);
		}else if(msg.equals(Lecture.WEB)){
			System.out.println("���������"+Lecture.WEB);
		}else if(msg.equals(Lecture.ANDROID)){
			System.out.println("���������"+Lecture.ANDROID);
		}
		
	}
	public void func2(String msg){
		lecture[0]="JaVa";
		if(msg.equals(lecture[0])){
			System.out.println("���������"+lecture[0]);
		}else if(msg.equals(lecture[1])){
			System.out.println("���������"+lecture[1]);
		}else if(msg.equals(lecture[2])){
			System.out.println("���������"+lecture[2]);
		}else if(msg.equals(lecture[3])){
			System.out.println("���������"+lecture[3]);
		}
		
	}
	public void func(String msg){
		if(msg.equals(JAVA)){
			System.out.println("���������"+JAVA);
		}else if(msg.equals(DB)){
			System.out.println("���������"+DB);
		}else if(msg.equals(WEB)){
			System.out.println("���������"+WEB);
		}else if(msg.equals(ANDROID)){
			System.out.println("���������"+ANDROID);
		}
		
	}

	public static void main(String[] args) {
		// ������
		// ������
		Ex07 me = new Ex07();
		me.func3(Lecture.JAVA);
	}

}
