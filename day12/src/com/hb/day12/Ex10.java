package com.hb.day12;

public class Ex10 {

	public static void main(String[] args) {
		// ¹®ÀÚ¿­
		String st1 = "Java";
		String st2 = new String("java");
		char[] ch1= {'j','a','v','a'};
		String st3= new String(ch1);
		
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1==st3);
		System.out.println(st3);
		System.out.println(st1.equals("java"));
		System.out.println(st1.length());
		System.out.println(st1.isEmpty());
		System.out.println(st1.charAt(0));
		System.out.println(st1.charAt(1));
		System.out.println(st1.charAt(2));
		System.out.println(st1.charAt(3));
		System.out.println(st1.charAt(0));
		System.out.println(st1.charAt(st1.length()-1));
		System.out.println(st1+"World");
		System.out.println(st1.concat("World").concat("2017"));
		
		System.out.println(st1);
		char[] ch2=new char[]{'j','a','v','a'};
		String st4=String.copyValueOf(ch2);
		System.out.println(st4);
		System.out.println(st1.endsWith("va"));
		System.out.println(st1.startsWith("j"));
		System.out.println(st1.equals("JAVA"));
		System.out.println(st1.equalsIgnoreCase("JAVA"));
		System.out.println(st1.indexOf('a'));
		System.out.println(st1.lastIndexOf('a'));
		System.out.println(st1.indexOf("ava"));
		System.out.println(st1.substring(1));
		System.out.println(st1.substring(1,st1.length()));
		System.out.println(st1.substring(1,4));
		System.out.println(st1.substring(0,3));
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		System.out.println("      ja     va    ".trim());
	}

}














