package com.hb.day10;

public class Ex05 {

	public static void main(String[] args) {
		// �迭 ����
		// �ڷ���[] ������ = new �ڷ���[����];
		// �迭��  �� : �ڷ���[] ������;
		// �迭�ʱ�ȭ : ������ = new �ڷ���[����];
		int[] arr1 = new int[3];
		// �����ʱ�ȭ : ������[�ε���]=valse;
		// �ε��� : �ݵ�� 0���� ����~���ӵǰ�~����-1
		arr1[0]=1;
		arr1[1]=3;
		arr1[2]=5;
		
		// ��� : ������[�ε���]
		
		int[] arr2=new int[]{1,2,3,4};
		
		int[] arr3={100,200,300,400};
		
		for(int i=0; i<4; i++){
			System.out.println(arr3[i]);
		}
		
		
		
	}

}













