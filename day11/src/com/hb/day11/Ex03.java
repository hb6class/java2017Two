package com.hb.day11;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={2015,2016,2017,2018};
//		int[] arr2={0,1,2016,2017,2018,5};
		
		int[] arr2=new int[arr1.length+2];
		
//		for(int i=0; i<arr1.length; i++){
//			arr2[i+1]=arr1[i];
//		}
		// �迭�� ���� ����
//		   System.arraycopy(���迭
//							,������index
//							,����迭
//							,���������ġindex
//							,�����Ұ���);
		System.arraycopy(arr1, 0, arr2, 1, 3);
		
		arr2[0]=arr1[0]-1;//2015;
		arr2[arr2.length-1]=arr1[arr1.length-1]+1;//2019;
		
		arr1[0]=1;
		
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println("\n------------------------------");
		
	}

}
