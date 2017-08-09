package com.hb.day12;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=1;
		int a2=1;
		int a3=1;
		int a4=1;
		int[] a= new int[4];
		for(int i=0; i<a.length; i++){
			a[i]=i+1;
		}
		int[] b=new int[]{1,2,3,4};
		int[] c={1,2,3,4};
		
//		if(b==c){
//			System.out.println("같다");
//		}else{
//			System.out.println("다르다");
//		}
		boolean tf=true;
		
		if(b.length==c.length){
			for(int i=0; i<b.length; i++){
				if(b[i]!=c[i]){
					tf=false;
					break;
				}
			}
		}else{
			tf=false;
		}
		if(tf){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	}

}








