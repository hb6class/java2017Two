package com.hb.day20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		Integer su=1111;
		set.add(su);
		su=new Integer(2222);
		set.add(su);
		Integer su2=new Integer(2222);
		set.add(su2);
		su=new Integer(3333);
		set.add(su);
		
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
