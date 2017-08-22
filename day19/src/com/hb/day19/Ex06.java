package com.hb.day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Lec06 implements Comparable{
	int su;

	@Override
	public int compareTo(Object obj) {
		int tmp=((Lec06)obj).su;
		return this.su-tmp;
	}
	
	
}

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set
		java.util.Set set = new TreeSet();
		Lec06 lec = new Lec06();
		lec.su=4;
		set.add(lec);
		lec = new Lec06();
		lec.su=2;
		set.add(lec);
		lec = new Lec06();
		lec.su=9;
		set.add(lec);
		lec = new Lec06();
		lec.su=1;
		set.add(lec);
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(((Lec06)ite.next()).su);
		}
	}

}
