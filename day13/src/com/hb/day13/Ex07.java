package com.hb.day13;

import java.io.Console;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//04.주민번호를 입력해주세요
		// >>>990101-1234567
		// 당신은 몇살 남자 입니다
		// >>>99010112345671
		// -을 생략하지 마세요
		// >>>990101-123456
		// 주민번호형식은 000000-0000000입니다
		Scanner sc = new Scanner(System.in);
		String input="";
		int age=0;
		while(true){
			System.out.print("주민번호입력>");
			input=sc.nextLine();
			if(input.length()==14){
				if(input.charAt(6)=='-'){
					break;
				}else{
					System.out.println("-을 생략하지 마세요");
				}
			}else{
				System.out.println("주민번호형식은 000000-0000000입니다");
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
		
		System.out.println("당신은 "+
							getAge(age)
							+"살 "
							+getGender(gender)
							+" 입니다");
	}
	static String getGender(int su){
		String msg;
		switch (su) {
		case 1:
		case 3:
			msg="남자";
			break;
		case 2:
		case 4:
			msg="여자";
			break;
		case 8:
		case 9:
			msg="외국인";
			break;

		default:
			msg="외계인";
			break;
		}
		return msg;
	}
	
	static int getAge(int su){
		int age=0;
		if(su<=17){
			// 2000년도이후 출생
			age=2017-(su+2000)+1;
		}else{
			// 2000년도이전(1900) 출생
			age=2017-(su+1900)+1;
		}
		return age;
	}

}












