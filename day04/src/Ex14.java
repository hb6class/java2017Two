class Ex14{
	public static void main(String[] args){
		//02. 학생 성적관리 프로그램(ver 0.0.1)
		//	국어=68
		//	영어=75
		//	수학=91
		// 	총합과 평균(소수둘째자리)을 구하시오
		// 국어=69,영어=75,수학=91, 총점=???,평균=??.??
		int kor=69;
		int eng=75;
		int math=91;
		int sum=kor+eng+math;
		double avg=sum*100/3/100.0;
		System.out.print("국어="+kor);
		System.out.print(",영어="+eng);
		System.out.print(",수학="+math);
		System.out.print(",총점="+sum);
		System.out.println(",평균="+avg);







		//03. 평균 90점이상 A
		//		80점이상 B
		//		70점이상 C
		//		60점이상 D
		//		60점미만 F	
		//	학생 학점을 구하시오(switch문 이용)

		switch((int)avg/10){
			case 10:
			case 9:
				System.out.println("A학점입니다");
			break;
			case 8:
				System.out.println("B학점입니다");
			break;
			case 7:
				System.out.println("C학점입니다");
			break;
			case 6:
				System.out.println("D학점입니다");
			break;

			default:
				System.out.println("F학점입니다");

		}

	}

}