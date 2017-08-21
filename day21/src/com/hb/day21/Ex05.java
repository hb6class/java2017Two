package com.hb.day21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map;
		map=new HashMap<String, String>();
		
		map.put("add1", "abc");
		map.put("add2", "bcd");
		map.put("add3", "cde");
		map.put("add4", "def");
		
		map.put("add3", "CDE");
		map.replace("add1", "ABC");
		map.remove("add2");
		
//		System.out.println(map.get("add1"));
//		System.out.println(map.get("add2"));
//		System.out.println(map.get("add5"));
//		System.out.println(map.get("add3"));
//		System.out.println(map.get("add4"));

//		Set<String> keys = map.keySet();
//		
//		for(String key:keys){
//			System.out.println(key+":"+map.get(key));
//		}
		
		Set<Entry<String, String>> ent = map.entrySet();
//		Iterator<Entry<String, String>> ite = ent.iterator();
//		while(ite.hasNext()){
//			Entry<String, String> entry = ite.next();
//			System.out.print(entry.getKey()+":");
//			System.out.println(entry.getValue());
//		}
		
		for(Map.Entry<String, String> entry : ent){
			System.out.print( entry.getKey()+":");
			System.out.println(entry.getValue());
		}
	}

}



























