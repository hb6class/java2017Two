package com.hb.day21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alist;
		alist= new ArrayList<String>();// �б�
		alist= new LinkedList<String>();// ����
		alist= new Vector<String>();
//		�Է�
		alist.add("msg1");
		alist.add("msg2");
		alist.add("msg3");
		alist.add("msg4");
//		�߰�
		alist.add(1,"msg1~2");
//		����
		alist.set(3, "edit3");
//		����
		alist.remove(4);
//		�б�
		for(int i=0; i<alist.size(); i++){
			System.out.println(alist.get(i));
		}
		System.out.println("------------------");
		for(String msg : alist){
			System.out.println(msg);
		}
		
	}

}










