package java04;

import java.util.Scanner;

public class Ex07 {
	
	public static int sum(int kor, int eng, int math){
		//총점
		return kor+eng+math;
	}
	
	public static double avg(int kor,int eng, int math){
		double avg=sum(kor,eng,math)*100/3/100.0;
		return avg;
	}
	
	public static void result(double avg){
		int su=(int)(avg/10);
		switch (su) {
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
			break;
		}
	}

	public static void main(String[] args) {
		// 성적관리프로그램
		// 성적(국어 영어 수학)
		// 총점 평균 
		// 학생수=???
		// 학점 
		Scanner sc=new Scanner(System.in);
		String input="";
		int kor=0;
		int eng=0;
		int math=0;
		
		while(true){
		System.out.print("국어:");
		input=sc.nextLine();
		kor=Integer.parseInt(input);
		System.out.print("영어:");
		input=sc.nextLine();
		eng=Integer.parseInt(input);
		System.out.print("수학:");
		input=sc.nextLine();
		math=Integer.parseInt(input);
		double avg=avg(kor,eng,math);
		
		System.out.print("국어:"+kor);
		System.out.print(",영어:"+eng);
		System.out.print(",수학:"+math);
		System.out.print(",총점:"+sum(kor,eng,math));
		System.out.print(",평균:"+avg);
		result(avg);
		
		if(input()==0){break;}
		
		}
	}
	
	public static int input(){
		Scanner sc=new Scanner(System.in);
		int su=0;
		while(true){
			System.out.print("1.계속 0.종료>");
			String input=sc.nextLine();
			su=Integer.parseInt(input);
			if(su==0 || su==1){
				break;
			}else{
				System.out.println("입력은 1또는0으로 해주세요");
			}
		}
		return su;
	}

}







