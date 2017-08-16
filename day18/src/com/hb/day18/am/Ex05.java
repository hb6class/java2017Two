package com.hb.day18.am;

class MyErr extends Exception {
	public MyErr() {
		super("내가 만들 null 예외처리클래스");
	}
}


public class Ex05{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=null;
		try{
			try{
	//			if(arr==null){
	//				throw new MyErr(); 
	//			}
				int a=5/0;
				for(int i=0; i<arr.length; i++){
					System.out.println(arr[i]);
				}
			}catch(Exception e){
				throw new MyErr();
			}
		}catch(MyErr e){
			System.out.println(e.getMessage());
		}
	}

}
