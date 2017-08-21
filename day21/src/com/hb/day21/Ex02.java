package com.hb.day21;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ele = new Vector<String>();
//		입력
		ele.addElement("ele01");
		ele.addElement("ele02");
		ele.addElement("ele03");
		ele.addElement("ele04");
//		추가
		ele.insertElementAt("ele1~2", 1);
//		수정
		ele.setElementAt("ele01", 3);
//		삭제
		ele.removeElementAt(4);
//		읽기
		Enumeration<String> enu = ele.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		System.out.println("--------------------");
		Iterator<String> ite = ele.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
//		for(int i=0; i<ele.size(); i++){
//			System.out.println(ele.elementAt(i));
//		}
	}

}











