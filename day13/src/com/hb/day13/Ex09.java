package com.hb.day13;

public class Ex09 {

	public static void main(String[] args) {
		//05.주민번호를 입력해주세요(한글지원)
		// >>>900101-1234567
		// 당신은 몇살 성년 남자 입니다
		
		// >>>구구공일공일-일이삼사오육칠
		// 당신은 몇살 미성년자 남자 입니다
		
		// >>>99010112345671
		// -을 생략하지 마세요
		// >>>990101-123456
		// 주민번호형식은 000000-0000000입니다
		char[] su1={'0','1','2','3','4','5','6','7','8','9'};
		char[] su2={'영','일','이','삼','사','오'
									,'육','칠','팔','구'};
		
		String input = "일이삼사오육-칠팔구1234";
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

















