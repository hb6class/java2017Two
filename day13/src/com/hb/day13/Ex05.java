package com.hb.day13;

public class Ex05 {
	
	public static void main(String[] args) {
		// boolean
		Boolean boo1= new Boolean(true);
		Boolean boo2= new Boolean("false");
		Boolean boo3= new Boolean("TRUE");
		boolean bo1=true;
		Boolean bo2=Boolean.TRUE;
		Boolean bo3=Boolean.FALSE;
		
		
		System.out.println(boo1);
		System.out.println(boo2);
		System.out.println(boo3.booleanValue());
	}
}
