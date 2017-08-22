package com.hb.day19;

import java.util.Iterator;
import java.util.Vector;

class MyVac extends Vector{
	
	@Override
	public synchronized void addElement(Object obj) {
		java.util.Enumeration enu= elements();
		while(enu.hasMoreElements()){
			if(enu.nextElement().equals(obj)){
				return;
			}
		}
		super.addElement(obj);// 추가
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 동적할당
		java.util.Vector vec1=new java.util.Vector();
//		vec1.add(1111);
//		vec1.add(2222);
//		vec1.add(3333);
		// List crud
		vec1.addElement('a');
		vec1.addElement('b');
		vec1.addElement('c');
		vec1.addElement('d');
		vec1.insertElementAt('e', 2);
		vec1.setElementAt('C', 3);
		vec1.removeElementAt(1);
		
		for(int i=0; i<vec1.size(); i++){
//			System.out.println(vec1.get(i));
			System.out.println(vec1.elementAt(i));
		}
		System.out.println("----------------------");
		Vector vec2 = new Vector();
		vec2.addElement(1111);
		vec2.addElement(2222);
		vec2.addElement(3333);
		vec2.addElement(4444);
		vec2.addElement(2222);
		// Enumeration 열거형(커서)-only Vector
//		java.util.Enumeration enu= vec2.elements();
//		while(enu.hasMoreElements()){
//			System.out.println(enu.nextElement());
//		}
		// Iterator 지시자 - Set type all
		Iterator ite = vec2.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("----------------------");
		Vector vec3=new Vector(5,3);
		vec3.addElement(1);
		vec3.addElement(1);
		vec3.addElement(1);
		vec3.addElement(1);
		vec3.addElement(1);
		vec3.addElement(1);
		vec3.elementAt(0);
//		vec3.trimToSize();
//		vec3.addElement(1);
		System.out.println(vec3.capacity());
	}

}









