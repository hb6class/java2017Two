package com.hb.day13;

public class Ex02 {
	public static void main(String[] args) {
		// wrapper≈¨∑°Ω∫
		// int 
		Integer a1=new Integer(200);
		Integer a2=new Integer("200");
		//ø¿≈‰∑¶«Œ
		Integer a3=15;
		//æ∑¶«Œ
		Integer a4=a1+a2;
		System.out.println(a1+a2);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(a1.intValue()+10);
		System.out.println(a1.toString()+10);
		System.out.println(a1.byteValue());
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(Integer.parseInt("300")+10);
		System.out.println(a1.doubleValue());
		System.out.println(Integer.valueOf(100)+20);
		System.out.println(Integer.valueOf("100")+20);
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toOctalString(15));
		System.out.println(Integer.toHexString(15));
		
	}

}








