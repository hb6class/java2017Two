package com.hb.day13;

public class Ex04 {

	public static void main(String[] args) {
		// ½Ç¼ö
		// double
		Double db1=new Double(3.14);
		Double db2=new Double("3.14");
		Double db3=3.14;
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MIN_NORMAL);
		System.out.println(Double.SIZE);
		System.out.println(db1.byteValue());
		System.out.println(db1+3.0==db2+3.0);
		System.out.println(db1.equals(db2));
		System.out.println(db1.toString()+3.0);
		System.out.println(Double.valueOf(3.14));
		System.out.println(Double.valueOf("3.14"));
		System.out.println(Double.toHexString(3.14));
		System.out.println(Double.parseDouble("3.14"));
		
		Double su1=3.0/0;
		System.out.println(su1.isInfinite());
		Double su2=0.0/0.0;
		System.out.println(su2.isNaN());
		System.out.println(su2.NaN);
		
		System.out.println("=================================");
		
		Float fl1=new Float(3.14);
		System.out.println(fl1.hashCode());
	}

}
















