package com.hb.day08;

public class Ex09 {

	public static void main(String[] args) {
		// 5+4+3+2+1=????(�޼ҵ�-int sum=func(5);)
		System.out.println(tot(31));
	}
	public static int tot(int start){
		// ����Լ� - �ڽ��� ��ȣ��
		if(start==1){
			return 1;
		}else{
			return start+tot(--start);
		}
	}

}
