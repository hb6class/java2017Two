package com.hb.day15;

public class Ex12 {

	static class MyArray{
		int length=0;
		int[] arr;
		
		void add(int a){
			int[] temp=new int[length++];
			for(int i=0; i<temp.length; i++){
				temp[i]=arr[i];
			}
			arr=new int[length];
			for(int i=0; i<temp.length; i++){
				arr[i]=temp[i];
			}
			arr[length-1]=a;
		}
		
		int get(int a){
			return arr[a];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray arr= new MyArray();
		
			arr.add(123);
			arr.add(123312312);
			arr.add(123122);
			arr.add(12313242);
			arr.add(1231323);
		
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr.get(i));
		}
	}

}
