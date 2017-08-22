package com.hb.day20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
//		list[index]=value;
//		list.add(value);
//		list.get(index);
//		index=숫자,시작0~, 숫자 연속, 중복x
		list.add(null);
		System.out.println(list.size());
//		list[key]=value;
//		숫자x, 연속x, 중복x
		
		java.util.Map map = new Hashtable();
		map.put("aa", "aaaa");
		map.put("bb", "bbbb");
		map.put("cc", "cccc");
		map.put("dd", "dddd");
		map.put("ee", "eeee");
		
//		String[] keys={"aa","bb","cc","dd","ee"};
//		System.out.println(map.size());
//		for(int i=0; i<keys.length; i++){
//			System.out.println(map.get(keys[i]));
//		}
		Set keys = map.keySet();
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			Object key = ite.next();
			System.out.println("key:"+key+",value:"+map.get(key));
		}
		
	}

}














