package com.hb.day19;

import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec1=new Vector();
		vec1.addElement(2222);
		vec1.addElement(3333);
		vec1.addElement(5555);
//		vec1.removeElementAt(2); // List
//		vec1.removeElement(5555); // Set
		System.out.println(vec1.firstElement());
		System.out.println(vec1.lastElement());
		System.out.println("---------------------");
		Vector vec2=(Vector)vec1.clone();
		vec2.removeAllElements();
		for(int i=0; i<vec1.size(); i++){
			System.out.println(vec1.elementAt(i));
		}
		System.out.println("---------------------");
//		vec2.addElement("start");
//		vec2.addElement("end");
		vec2.addAll(vec1);
//		for(int i=1; i<vec1.size(); i++){
//			vec2.addElement(vec1.elementAt(i));
//		}
//		vec2=new Vector(vec1);
		System.out.println("---------------------");
		System.out.println(vec2.isEmpty());
		for(int i=0; i<vec2.size(); i++){
			System.out.println(vec2.elementAt(i));
		}
		System.out.println("---------------------");
		System.out.println(vec2.contains(3333));
		System.out.println("---------------------");
//		int[] arr1=new int[vec2.size()];
//		for(int i=0; i<arr1.length; i++){
//			arr1[i]=(Integer)vec2.elementAt(i);
//		}
		Object[] arr2=vec2.toArray();
//		int[] arr3=new int[arr2.length];
//		for(int i=0; i<arr3.length; i++){
//			arr3[i]=(Integer)arr2[i];
//		}
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
	}

}








