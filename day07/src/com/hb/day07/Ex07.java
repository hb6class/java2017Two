package com.hb.day07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		int a=Integer.parseInt(input);
		
		switch (a%2) {
		case 1:
			System.out.println("Ȧ��");
			break;
		case 0:
			System.out.println("¦��");
			break;

		default:
			System.out.println("����");
			break;
		}
		
	}

}
