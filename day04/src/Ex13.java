class Ex13{
	public static void main(String[] args){
		// 조건문 switch문
		/* 
		switch(값){
			case 값:
				실행문;
				break;
			case 값:
				실행문;
				break;
			case 값:
				실행문;
				break;
			~~~~~~~~~~~~~~~
			default:
				실행문;
		}
		*/

		switch(2+3){
			case 4:
			System.out.println("사입니다");
			//break;
			case 5:
			System.out.println("오입니다");
			//break;
			case 6:
			System.out.println("육입니다");
			//break;
			default:
			System.out.println("4~6은 아닙니다");
			break;
		}
		//Q1. n=7 짝수인지 홀수인지 출력
		//

		int n=102;
		String msg="";
		switch(n%2){
			case 1: 
				msg="홀";
				break;
			case 0: msg="짝";break;

		}
		System.out.println("n="+n+"은 "+msg+"수 입니다");

		//02. 학생 성적관리 프로그램
		//	국어=68
		//	영어=75
		//	수학=91
		// 	총합과 평균(소수둘째자리)을 구하시오
		// 국어=68,영어=75,수학=91, 총점=???,평균=??.??
		//
		//03. 평균 90점이상 A
		//		80점이상 B
		//		70점이상 C
		//		60점이상 D
		//		60점미만 F	
		//	학생 학점을 구하시오(switch문 이용)	
	}

}