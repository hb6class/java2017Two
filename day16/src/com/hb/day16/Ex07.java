package com.hb.day16;

public class Ex07 {

	
	
	public static void main(String[] args) {
		// ���� ó��
		int su=0;
		int[] arr=new int[3];
		try{
			System.out.println(1);
			System.out.println(2);
					System.out.println(5/0);
					su=Integer.parseInt("a");
//			System.out.println(arr[3]);
			System.out.println(3);
		}catch(IndexOutOfBoundsException ex){
			System.out.println("�迭�� �ε��� ����");
		}catch(NumberFormatException ex){
		System.out.println("���������� �ƴϱ⿡ ");
//		}catch(ArithmeticException ex){
//		System.out.println("0���� �������� �Ͼ�� ���� ");
		}catch(Exception ex){
		}
		System.out.println("END");
	}

}
