package com.hb.day08;

public class Ex11 {

	public static void main(String[] args) {
		// 2�� ���� �� ��, ���� 1000�� �Ѵ�n=?
		int n=0;// �������?
		int tot=1; // ���� ��
		while(true){
			tot*=2;
			n++;
			if(tot>1000){
				break;
			}
		}
		System.out.println("n="+n);
	}

}
