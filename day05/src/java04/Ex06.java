package java04;

import java.util.Scanner;

// 개발자폰트
// 1 ㅣ | I ㅣ
//0oㅇ

public class Ex06 {

	public static void main(String[] args) {
		// 학생 성적관리 프로그램(ver 0.0.2)
		// 국어 영어 수학 성적을 입력받고
		// 총점, 평균, 학점을 구하는 프로그램을 
		// 작성하시오
		// 평균은 소수 둘째 자리까지 입니다.
		// 단, 프로그램 종료 전까지는 계속
		// 계속(1), 종료(0)>0
		Scanner sc = new Scanner(System.in);
		String temp="";
		char credit='F';
		int input=0;
		while(true){
			student();
			
			System.out.print("계속(1), 종료(0)>");
			temp=sc.nextLine();
			input=Integer.parseInt(temp);
			if(input==0){
				break;
			}
		}
		System.out.println("사용해주셔서 감사합니다");
	}
	
	public static void student(){
		
		int kor, eng, math;
		kor=0;eng=0;math=0;
		
		kor=inputSu("국어:");
		eng=inputSu("영어:");
		math=inputSu("수학:");
		
		
		System.out.print("국어:"+kor);
		System.out.print(",영어:"+eng);
		System.out.print(",수학:"+math);
		
		
		System.out.print(",합계:"+sum(kor,eng,math));
		
		System.out.print(",평균:"+avg(kor,eng,math));
		
		switch (func01(kor,eng,math)) {
		case 10:
		case 9:
			show('A');
			break;
		case 8:
			show('B');
			break;
		case 7:
			show('C');
			break;
		case 6:
			show('D');
			break;

		default:
			show('F');
		}
	}
	
	public static int inputSu(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		String temp=sc.nextLine();
		return Integer.parseInt(temp);
	}
	
	public static void show(char credit){
		System.out.println(credit+"학점");		
	}
	
	public static int sum(int kor, int eng, int math){
		
		return (kor+eng+math);
	}
	
	public static double avg(int kor, int eng, int math){
		return ((kor+eng+math)*100/3/100.0);
	}
	
	public static int func01(int kor, int eng, int math){
		int result=(kor+eng+math)*100/3/1000;
		return result;
	}

}











