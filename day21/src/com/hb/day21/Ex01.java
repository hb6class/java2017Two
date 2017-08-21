package com.hb.day21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alist;
		alist= new ArrayList<String>();// 읽기
		alist= new LinkedList<String>();// 쓰기
		alist= new Vector<String>();
//		입력
		alist.add("msg1");
		alist.add("msg2");
		alist.add("msg3");
		alist.add("msg4");
//		추가
		alist.add(1,"msg1~2");
//		수정
		alist.set(3, "edit3");
//		삭제
		alist.remove(4);
//		읽기
		for(int i=0; i<alist.size(); i++){
			System.out.println(alist.get(i));
		}
		System.out.println("------------------");
		for(String msg : alist){
			System.out.println(msg);
		}
		
	}

}










