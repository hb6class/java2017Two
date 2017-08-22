package com.hb.day19.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex05 {

	public static void main(String[] args) {
		// 집합 Set
		java.util.Set set = new HashSet();
		set=new TreeSet();
		set.add(100);
		set.add(120);
		set.add(200);
		set.add(300);
		set.add(120);
		set.remove(300);
		System.out.println(set.size());
		// 시간x - 순서x - index x
		// 입력o
		// 삭제o
		// 수정x
		System.out.println("-------------------");
		Iterator ite = set.iterator();
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println("-------------------");
		Iterator ite2=set.iterator();
		System.out.println(ite2.next());
		System.out.println(ite2.next());
		System.out.println(ite2.next());
		System.out.println("-------------------");
		Iterator ite3=set.iterator();
		for(int i=0; i<set.size(); i++){
			System.out.println(ite3.next());
		}
		System.out.println("-------------------");
		Iterator ite4 = set.iterator();
		while(ite4.hasNext()){
			System.out.println(ite4.next());
		}
	}

}






























