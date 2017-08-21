package com.hb.day21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set ;
		set= new HashSet<String>();
		set= new TreeSet<String>();
		set.add("ele01");
		set.add("ele02");
		set.add("ele03");
		set.add("ele01");
		set.add("ele05");
		
		set.remove("ele01");
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("-------------------");
//		개선된 루프문
		for(String msg:set){
			System.out.println(msg);
		}
	}

}










