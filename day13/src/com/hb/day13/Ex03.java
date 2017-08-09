package com.hb.day13;

public class Ex03 {

	public static void main(String[] args) {
		// byte
		byte su=100;
		Byte by1=new Byte(su);
		Byte by2=new Byte("100");
		
		System.out.println(by1);
		System.out.println(by2);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		// short
		short su2=100;
		Short sh1=new Short(su);
		Short sh2=new Short("100");
		
		System.out.println(sh1);
		System.out.println(sh2);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.SIZE);
		// long
		short su3=100;
		Long lng1=new Long(su3);
		Long lng2=new Long("100");
		
		System.out.println(lng1);
		System.out.println(lng2);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);

	}

}
