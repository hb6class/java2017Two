package com.hb.day20;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CharSequence> arr1= new ArrayList<CharSequence>();
		String st=new String("abc");
		arr1.add(st);
		st.concat("defg");
		arr1.add(st);
		st.concat("hijk");
		arr1.add(st);
		arr1.add("----------------------");
		StringBuffer sb1=new StringBuffer();
		sb1.append("abc");
		arr1.add(sb1);
		sb1.append("defg");
		arr1.add(sb1);
		sb1.append("hijk");
		arr1.add(sb1);
		
		for(int i=0; i<arr1.size(); i++){
			System.out.println(arr1.get(i));
		}
		
	}

}
