package java04;

import java.util.Scanner;


public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("입력>");
		
		Scanner sc = new Scanner(System.in);
		//입력받기위해 준비
		
		String msg1 = sc.nextLine();
//		sc.nextLine(); 콘솔창에 입력받음
		String msg2 = sc.nextLine();
		String msg3 = sc.nextLine();
		
		int su = Integer.parseInt(msg1);
//		Integer.parseInt("") 문자열을 숫자로 변환
		
		System.out.println("입력하신 값은 "+(su+100));
		System.out.println("msg2: "+msg2);
		System.out.println("msg3: "+msg3);
	}

}










