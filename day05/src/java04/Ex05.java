package java04;

import java.util.Scanner;


public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Է�>");
		
		Scanner sc = new Scanner(System.in);
		//�Է¹ޱ����� �غ�
		
		String msg1 = sc.nextLine();
//		sc.nextLine(); �ܼ�â�� �Է¹���
		String msg2 = sc.nextLine();
		String msg3 = sc.nextLine();
		
		int su = Integer.parseInt(msg1);
//		Integer.parseInt("") ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է��Ͻ� ���� "+(su+100));
		System.out.println("msg2: "+msg2);
		System.out.println("msg3: "+msg3);
	}

}










