package com.hb.day07;

public class Ex02 {

	public static void main(String[] args) {
		// ��� - ������ �ʴ� ��
		// - �ҽ��ڵ忡�� ��ȯ���� �ʴ� �̻�
		// 		������ �ʴ� ��
		System.out.println(0.01);
		// ���� - ��� ����
		// x + y = 100; x=10; y=?
		// ������ ��  �� : �ڷ��� ������;
		// ������ �ʱ�ȭ : ������ = ��;
		// or �ڷ��� ������ = ��;
		
		// �ڷ��� - ����� ���� ���ΰ�?
		// 1.10���� ���� 3;
		byte a1=127;	// -128~0~127
		short a2=3;
		int a3=3;
		long a4=3l;
		// 2.10���� �Ǽ��� 3.14;
		// 0.00001~0.00002
		// ��Ȯ�� �� 2��64��
		// 1.444556e30303
		
		float b1=3.14f;
		double b2=3.14;
		
		// 3. 10����
		// 10����	8����	16����
		// 7		07		0x7
		// 8		010		0x8
		// 9		011		0x9
		// 10		012		0xa
		// 11		013		0xb
		// ...
		// 15		017		0xf
		// 16		020		0x10
		
		// ���� - ���� ���ڿ�
		// ���� char
		// �ڷ���-3. ��� ǥ���Ұ��ΰ�?
		// �����ڵ� (char)1 == '\u0001';
		char c1='A';
		System.out.println((char)(c1+'a'));
		// ���ڿ�
		String d1="";
		String d2="j";
		String d3="ava";
		String d4=d2+d3+100;
		String d5=100+"";// "100"
		System.out.println(d4);
		System.out.println("java");
		
		int e1=(int)'a';
		int e2='a'-'A';
		for(int i=0; i<'z'-'a'+1;i++){
			System.out.print((char)(e1+i-e2));
		}
		
		// true || false
		// boolean��
		boolean g1=true;
		boolean g2=false;
		
		// �񱳿���
		boolean g3a = 3>2;
		boolean g3b = 3>=2;
		boolean g4a = 3<2;
		boolean g4b = 3<=2;
		boolean g5 = 3==2;
		boolean g6 = 3!=2;
		
		// ������
		boolean g7 = true&&true; 
		//and�׸��� - ��ΰ� ���� ��츸 ��
		//				�������� ����
		boolean g8 = false||false; 
		//or�Ǵ�-��ΰ� ������ ��츸 ����
		//				�ܿ��� ��
		boolean g9 = !(true); // not
		
		// ���� ������
		
		int m=1;
		++m;// m=m+1; ����� +1�ϰ� ���
		m++;// m=m+1; ����� +1��
		
		--m;
		m--;
		
		// =���Կ�����(���� ������ ����)
		// =, +=, -=, *=, /=....
		
		int n=1;
		n+=2; // n=n+2;
		n-=2; // n=n-2;
		n*=2; // n=n*2;
		n/=2; // n=n/2;
		n%=2; // n=n%2;
		System.out.println();
		
		
	}
	
}









