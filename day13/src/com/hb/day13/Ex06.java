package com.hb.day13;

public class Ex06 {

	public static void main(String[] args) {
		// char
		Character ch1= new Character('a');
		
		System.out.println(Character.MAX_VALUE=='\uFFFF');
		System.out.println(Character.MIN_VALUE=='\u0000');
		System.out.println(Character.SIZE);
		System.out.println(ch1.charValue());
		System.out.println(ch1.toString());
		System.out.println(Character.valueOf('c'));
		
		// 유니코드인지....
		System.out.println(Character.isDefined(' '));
		// 문자인지 검사
		System.out.println(Character.isLetter('!'));
		// 알파벳인지
		System.out.println(Character.isAlphabetic('!'));
		
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('A'));
		// 숫자인지
		System.out.println(Character.isDigit('0'));
		
		System.out.println(Character.isSpace(' '));
		System.out.println(Character.isWhitespace(' '));
	}

}
















