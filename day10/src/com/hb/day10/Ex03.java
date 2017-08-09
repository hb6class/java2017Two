package com.hb.day10;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java="Java";
		String world="World";
		String msg1="Java"+"World";
		String msg2="java".concat(world);
		String msg3=111+"";
		String msg4=String.valueOf(111);
		String msg5=String.valueOf(3.14);
		String msg6=String.valueOf('a');
		System.out.println(msg4);
		
		if("Java".equals(java)){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
			
		}
	}

}
