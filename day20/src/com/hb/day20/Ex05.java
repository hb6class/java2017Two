package com.hb.day20;

import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> arr=new ArrayList<Number>();
		arr.add(1111);
		arr.add(2222);
		arr.add(3333);
		arr.add(3.14);
		
		for(int i=0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}
	}

}
