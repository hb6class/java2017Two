package com.hb.day19.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List list=null;
		list=new ArrayList();
		
		list=new LinkedList();
		list.add(1111);
		list.add(1114);
		list.add(1113);
		
		LinkedList list2=(LinkedList)list;
		
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
	}

}
