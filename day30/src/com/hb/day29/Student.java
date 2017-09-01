package com.hb.day29;

import java.io.Serializable;

public class Student implements Serializable{
	
	public int kor;
	transient public int eng;
	public int math;
	
	public Student(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	public void sum(){
		System.out.println("гу╟Х");
	}
}