package com.hb.day13;

public class Ex09 {

	public static void main(String[] args) {
		//05.�ֹι�ȣ�� �Է����ּ���(�ѱ�����)
		// >>>900101-1234567
		// ����� ��� ���� ���� �Դϴ�
		
		// >>>�������ϰ���-���̻�����ĥ
		// ����� ��� �̼����� ���� �Դϴ�
		
		// >>>99010112345671
		// -�� �������� ������
		// >>>990101-123456
		// �ֹι�ȣ������ 000000-0000000�Դϴ�
		char[] su1={'0','1','2','3','4','5','6','7','8','9'};
		char[] su2={'��','��','��','��','��','��'
									,'��','ĥ','��','��'};
		
		String input = "���̻�����-ĥ�ȱ�1234";
		char[] temp=input.toCharArray();
		for(int i=0; i<temp.length; i++){
			for(int j=0; j<su2.length; j++){
				if(temp[i]==su2[j]){
					temp[i]=su1[j];
					break;
				}
			}
		}
		input=new String(temp);
		System.out.println(input);
		
//		"123456";
	}

}

















