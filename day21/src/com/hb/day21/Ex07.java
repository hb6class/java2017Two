package com.hb.day21;

import java.util.StringTokenizer;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Java   Database Web Framework Android";
		
		java.util.StringTokenizer token;
		token=new StringTokenizer(msg);
		System.out.println(token.countTokens());
		while(token.hasMoreTokens()){
			System.out.println(token.nextToken());
		}
	}

}
