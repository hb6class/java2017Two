package com.hb.day13;

import java.io.Console;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//04.�ֹι�ȣ�� �Է����ּ���
		// >>>990101-1234567
		// ����� ��� ���� �Դϴ�
		// >>>99010112345671
		// -�� �������� ������
		// >>>990101-123456
		// �ֹι�ȣ������ 000000-0000000�Դϴ�
		Scanner sc = new Scanner(System.in);
		String input="";
		int age=0;
		while(true){
			System.out.print("�ֹι�ȣ�Է�>");
			input=sc.nextLine();
			if(input.length()==14){
				if(input.charAt(6)=='-'){
					break;
				}else{
					System.out.println("-�� �������� ������");
				}
			}else{
				System.out.println("�ֹι�ȣ������ 000000-0000000�Դϴ�");
			}
		}
//		age=(input.charAt(0)-'0')*10
//					+(input.charAt(1)-'0')*1;
//		age=Integer.parseInt(input.charAt(0)
//				+""+input.charAt(1));
		
//		char[] tmp2={input.charAt(0),input.charAt(1)};
		char[] tmp2=new char[2];
		System.arraycopy(input.toCharArray()
							, 0, tmp2, 0, 2);
		String tmp1=new String(tmp2);
		age=Integer.parseInt(tmp1);
		
		int gender=input.charAt(7)-'0';
		
		System.out.println("����� "+
							getAge(age)
							+"�� "
							+getGender(gender)
							+" �Դϴ�");
	}
	static String getGender(int su){
		String msg;
		switch (su) {
		case 1:
		case 3:
			msg="����";
			break;
		case 2:
		case 4:
			msg="����";
			break;
		case 8:
		case 9:
			msg="�ܱ���";
			break;

		default:
			msg="�ܰ���";
			break;
		}
		return msg;
	}
	
	static int getAge(int su){
		int age=0;
		if(su<=17){
			// 2000�⵵���� ���
			age=2017-(su+2000)+1;
		}else{
			// 2000�⵵����(1900) ���
			age=2017-(su+1900)+1;
		}
		return age;
	}

}












