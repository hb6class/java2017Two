package com.hb.day17;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb.capacity());
		sb.append("12345");
		sb.append("12345");
		sb.append("12345");
		sb.append("1");
		sb.append("2");
		System.out.println(sb.capacity());
		
	}

}
