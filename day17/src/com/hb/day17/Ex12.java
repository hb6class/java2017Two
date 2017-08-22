package com.hb.day17;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(10);
		sb.append(1234567890);
		sb.append(1234567890);
		sb.append(1);
		sb.append(1);
		sb.append(1);
		System.out.println(sb.capacity());
		StringBuilder sb2=new StringBuilder("java");
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		
	}

}
