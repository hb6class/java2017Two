package com.hb.day19.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		// System.currentTimeMillis() 1970.01.01~
		List list = new ArrayList();
//		list=new LinkedList();
//		System.out.println(time);
		
		for(int i=0; i<1000000; i++){
			list.add(i);
		}
		Long time=System.currentTimeMillis();
		for(int i=0; i<1000000; i++){
			list.get(i);
		}
		Long time2=System.currentTimeMillis();
		System.out.println(time2-time);
	}

}
