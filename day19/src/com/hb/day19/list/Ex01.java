package com.hb.day19.list;

import java.util.ArrayList;

class Lec01{
	int su;
}

public class Ex01 {

	public static void main(String[] args) {
		// 배열을 이용한 동적할당
		// get() 유리
		java.util.ArrayList<Object> list=null;
		
		list=new java.util.ArrayList<Object>();
		
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(1111);
		list.add("java");
		list.add("web");
		list.add("framework");
		list.add("framework");
		Lec01 lec01 = new Lec01();
		lec01.su=100;
		list.add(lec01);
		Lec01 lec02 = new Lec01();
		lec02.su=120;
		list.add(lec02);
		Lec01 lec03 = new Lec01();
		lec03.su=123;
		list.add(lec03);
		
		// add(value)-맨 마지막 추가
		// add(index,value)-index위치에 추가
		// remove(index)-삭제
		// set(index,value)-수정
		// get(index)-index의 value확인
		
//		System.out.println(list.size());
//		list.remove(1);
		list.set(1, 4444);
		list.add(1,2222);
		for(int i=0; i<list.size(); i++){
//			Lec01 temp=(Lec01) list.get(i);
//			System.out.println(temp.su);
//			System.out.println(((Lec01)list.get(i)).su);
			System.out.println(list.get(i));
		}
		System.out.println("---------------------------");
		ArrayList list2 = list;
		list2.add(5555);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println(list==list2);
		System.out.println("---------------------------");
		ArrayList list3 = new ArrayList();
		for(int i=0; i<list.size(); i++){
			list3.add(list.get(i));
		}
		for(int i=0; i<list3.size(); i++){
			System.out.println(list3.get(i));
		}
		System.out.println(list==list3);
		System.out.println("---------------------------");
		ArrayList list4=(ArrayList)list.clone();
		for(int i=0; i<list4.size(); i++){
			System.out.println(list4.get(i));
		}
		System.out.println(list==list4);
		System.out.println("---------------------------");
		int a=1111;
		Integer a1=a;
		boolean result=false;
		for(int i=0; i<list.size(); i++){
			if(a1.equals(list.get(i))){
				result=true;
			}
		}
		System.out.println(result);
		System.out.println("---------------------------");
		System.out.println(list.contains(6666));
		System.out.println("---------------------------");
		int i=-1;
		for(i=0; i<list.size(); i++){
			if(list.get(i).equals(a)){
				break;
			}
			if(i==list.size()-1){
				i=-1;
				break;
			}
		}
		System.out.println(i);
//		System.out.println(list.get(3));
		System.out.println("---------------------------");
		System.out.println(list.indexOf(1111));
		System.out.println(list.indexOf(5555));
		System.out.println(list.indexOf(6666));
		System.out.println("---------------------------");
		int m=0;
		
		for(m=list.size()-1; m>-1; m--){
			if(list.get(m).equals(7777)){
				break;
			}
		}
		System.out.println(m);
//		System.out.println(list.get(m));
		System.out.println("---------------------------");
		System.out.println(list.lastIndexOf(1111));
		System.out.println("---------------------------");
		ArrayList list5 = new ArrayList();
		list5.add(11);
		list5.clear();
		System.out.println(list5.size());
		System.out.println(list5.isEmpty());
		
	}

}





















