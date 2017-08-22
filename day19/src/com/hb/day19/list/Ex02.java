package com.hb.day19.list;

import java.util.LinkedList;

import javax.naming.LinkLoopException;

public class Ex02 {

	public static void main(String[] args) {
		// 객체를 이용한 동적할당
		// 입력,수정,삭제 유리
		java.util.LinkedList list = new java.util.LinkedList();
		list.add(1111);
		list.add(1122);
		list.add(1333);
		list.add(1,1112);
		list.set(3, 3333);
		list.remove(0);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println(list.indexOf(1122));
		System.out.println(list.contains(3333));
		LinkedList list2 = (LinkedList)list.clone();
		System.out.println(list2==list);
	}

}
