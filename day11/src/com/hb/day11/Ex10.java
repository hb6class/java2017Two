package com.hb.day11;

public class Ex10 {

	public static void main(String[] args) {
		// 로또
		// 1. 랜덤 
		// 2. 중복
		// 3. sort
		int[] lotto = new int[7];
//		int[] lotto = {10,31,44,21,2,9};
//		int[] lotto = {2,31,44,21,10,9};
		
		for(int i=0; i<lotto.length; i++){
			lotto[i]=ran();
			for(int j=0; j<i; j++){
				if(lotto[j]==lotto[i]){
					i--;
					break;
				}
			}
		}
		
		sort(lotto);
		
		for(int i=0; i<lotto.length; i++){
			if(i==lotto.length-1){
				System.out.print("보너스번호:");
			}
			System.out.print(lotto[i]+" ");
		}
	}
	
	public static int ran(){
		// 1~45
//		(int)(Math.random()*45)+1;
		// 0~99
		int su=0;
		while(true){
			su=(int)(Math.random()*100);
			if(su>0&&su<46){
				break;
			}
		}
		return su;
	}
	
	public static void sort(int[] arr){
		int tmp=0;
		for(int n=0; n<arr.length-2; n++){
			for(int m=n+1; m<arr.length-1; m++){
				if(arr[n]>arr[m]){
					tmp=arr[n];
					arr[n]=arr[m];
					arr[m]=tmp;
				}
			}
		}
		
	}
	
}














