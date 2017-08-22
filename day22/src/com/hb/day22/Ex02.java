package com.hb.day22;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,3,5,7};
//		int[] arr2={-3,-1,0,0,0,0};
//		System.arraycopy(arr1, 0, arr2, 2, arr1.length);
		
//		int[] arr2=Arrays.copyOfRange(arr1, 1, 4);
		int[] arr2=new int[10];
		
//		Arrays.fill(arr2, 100);
		Arrays.fill(arr2,1,9,100);
		
		for(int a : arr2){
			System.out.println(a);
		}
		System.out.println("---------------------------");
		System.out.println(arr2.toString());
		System.out.println(Arrays.toString(arr2));
		System.out.println("---------------------------");
		System.out.println(Arrays.binarySearch(arr1, 3));
		System.out.println("---------------------------");
		String msg="Java";
		char[] ch=msg.toCharArray();
//		char[] ch2={'j','a','v','a','W','e','b'};
//		System.out.println(Arrays.binarySearch(ch2,0,7, 'a'));
		System.out.println("---------------------------");
		int[] arr3={100,3,29,64,49};
//		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.binarySearch(arr3, 3));
		System.out.println("---------------------------");
		char[] ch3={'b','a','t','°¡','z'};
//		Arrays.sort(ch3);
		System.out.println(Arrays.toString(ch3));
		System.out.println(Arrays.binarySearch(ch3, '°¡'));
		System.out.println("---------------------------");
		String[] name={"È«","È«±æµ¿","È«¸»ÀÚ","ÇãÁØ","±è°³¶Ë"};
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.binarySearch(name, "È«¸»ÀÚ"));
		System.out.println("---------------------------");
		Lec02[] lec = new Lec02[4];
		Lec02 lec0=new Lec02(3);
		Lec02 lec1=new Lec02(1);
		Lec02 lec2=new Lec02(2);
		Lec02 lec3=new Lec02(4);
		lec[0]=lec0;
		lec[1]=lec1;
		lec[2]=lec2;
		lec[3]=lec3;
		Arrays.sort(lec);
		System.out.println(Arrays.toString(lec));
		System.out.println(Arrays.binarySearch(lec, lec2));
	}

}

class Lec02 implements Comparable<Lec02>{
	int su;
	public Lec02(int su) {
		this.su=su;
	}
	@Override
	public int compareTo(Lec02 obj) {
//		return this.su-obj.su; // ¿À¸§Â÷¼ø
		return obj.su-this.su;	// ³»¸²Â÷¼ø
	}
	@Override
	public String toString() {
		return su+"";
	}
}












