package com.hb.day18.pm;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//동적할당(배열)
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(100);
		list.add(10);
		list.add(123);
		list.add(133);
		list.add(1444);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		//동적할당(객체)
		LinkedList list2 = new LinkedList();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list2.add("e");
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
	}

}















