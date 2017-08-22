package com.hb.day17;

public class Ex10 {

	public static void main(String[] args) {
		// 문자열
//		String msg ="java 1.";
//		for(int i=0; i<9; i++){
//			String temp=msg+i;
//			System.out.println(temp);
//		}
		String st="java";
		System.out.println(st.hashCode());
		st=st+"frameWork";
		System.out.println(st);
		System.out.println(st.hashCode());
		String st2=st;
		st=st+"2017";
		System.out.println(st2);
		System.out.println("-----------------");
		StringBuilder sb=new StringBuilder("java");
		System.out.println(sb.hashCode());
		sb.append("frameWork");// "java"+"frameWork";
		// 추가
		System.out.println(sb);
		System.out.println(sb.hashCode());
		// 수정
		sb.replace(4, sb.length(), "Web");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		// 삭제
//		sb.replace(4, sb.length(), "");
		sb.delete(4, sb.length());
		System.out.println(sb);
		System.out.println(sb.hashCode());
		// 중간에 추가
//		sb.replace(2, 4, " va");
		sb.insert(2, " ");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		char[] buffer={' ','w','e','b'};
		sb.append(buffer);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(1004);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		StringBuilder sb2=sb;
		sb.append(2017);
		System.out.println(sb2);
	}

}












