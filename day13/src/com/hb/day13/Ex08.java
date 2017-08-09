package com.hb.day13;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 회원가입
		// 사용하실 아이디(특수문자사용불가)>
		// 사용하실 패스워드(8자이상16미만, 대,소,숫자 조합)>
		// 패스워드 재입력>
		// 생년월일(ex.990101)>
		// 아이디님 가입을 축하드립니다
		Scanner sc = new Scanner(System.in);
		String input="";
		String id=null;
		char[] ch;
		boolean chk1;
		// id chk;
		while(true){
		System.out.print("사용하실 아이디(특수문자사용불가)>");
		input=sc.nextLine();
		ch=input.toCharArray();
			chk1=true;
			for(int i=0; i<ch.length; i++){
				if(!Character.isAlphabetic(ch[i])){
					if(!Character.isDigit(ch[i])){
						chk1=false;
					}
				}
			}
			if(chk1){
				id=input;
				break;
			}else{
				System.out.println("id에 특수문자 사용 불가");
			}
		}
		// pw chk;
		boolean[] chk2;
		while(true){
			System.out.print("사용하실 패스워드(4자이상6미만, 대,소,숫자 조합)>");
			input=sc.nextLine();
			if(input.length()<4||input.length()>5){
				System.out.println("패스워드는 4자이상,6자미만입니다");
				continue;
			}
			ch=input.toCharArray();
			chk2=new boolean[]{false,false,false};
			for(int i=0; i<ch.length; i++){
				if(Character.isUpperCase(ch[i])){
					chk2[0]=true;
				}else if(Character.isLowerCase(ch[i])){
					chk2[1]=true;
				}else if(Character.isDigit(ch[i])){
					chk2[2]=true;
				}
			}
			System.out.println(chk2[0]+":"+chk2[1]+":"+chk2[2]);
			if(!(chk2[0]&&chk2[1]&&chk2[2])){
				System.out.println("패스워드는 대,소,숫자 조합으로 입력하세요");
				continue;			
			}
			while(true){
				System.out.print("패스워드 재입력>");
				if(input.equals(sc.nextLine())){
					break;
				}else{
					System.out.println("재입력 확인");
				}
			}
			break;
		}
		//생년월일
		boolean chk3;
		while(true){
			System.out.print("생년월일(ex.990101)>");
			input=sc.nextLine();
			chk3=true;
			ch=input.toCharArray();
			if(input.length()!=6){
				System.out.println("입력 확인");
				continue;
			}
			for(int i=0; i<ch.length; i++){
				if(!Character.isDigit(ch[i])){
					chk3=false;
				}
			}
			if(chk3){
				break;
			}else{
				System.out.println("입력 확인");
			}
		}

		System.out.println(id+"님 가입을 축하드립니다");
	}

}














