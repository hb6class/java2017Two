package com.hb.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map;
		map= new HashMap<String, String>(5);
		
		map.put("a", "aaaa");
		map.put("b", "bbbbbbb");
		map.put("c", "");
		map.put("ddd", "ddddd");
		map.put("c","cc");
		map.remove("b");
		System.out.println("size:"+map.size());
		Set<String> keys = map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			System.out.println(map.get(key));
		}
		System.out.println("-------------------");
		HashMap<String, String> map2;
		map2=new HashMap<String, String>();
		ite = keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			map2.put(key,map.get(key));
		}
		System.out.println(map2.size());
		System.out.println("-------------------");
		HashMap<String, String> map3;
		map3=(HashMap<String, String>)map.clone();
		System.out.println(map3.size());
		System.out.println("-------------------");
		HashMap<String, String> map4=new HashMap<String, String>();
		map4.putAll(map);
//		map4.clear();
		System.out.println(map4.size());
		System.out.println("-------------------");
		System.out.println(map4.containsValue("aaaab"));
		System.out.println(map4.containsKey(""));
		System.out.println("-------------------");
		HashMap<String, String> map5;
		map5=new HashMap<String, String>(map);
		System.out.println(map5.size());
	}

}








