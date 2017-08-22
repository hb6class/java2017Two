package com.hb.day20;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// 제네릭 - 자료형<참조자료형>
		// 동적할당에 입력되는 타입 제약
		ArrayList<Integer> list1;
		list1= new ArrayList<Integer>();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);
		
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		System.out.println("------------------------");
		int[] arr1={1,2,3,4,5};
		int[] arr2={10,20,30,40,50};
		int[] arr3={100,200,300,400,500};
		
		ArrayList<int[]> list2=new ArrayList<int[]>();
		list2.add(arr1);
		list2.add(arr2);
		list2.add(arr3);
		
		for(int i=0; i<list2.size(); i++){
			int[] obj=list2.get(i);
			//System.out.println(obj);
			for(int j=0; j<obj.length; j++){
				System.out.print(obj[j]+" ");
			}
			System.out.println();
		}
	}

}
















