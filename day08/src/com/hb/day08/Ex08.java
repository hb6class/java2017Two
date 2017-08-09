package com.hb.day08;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * Q1.	1~100까지의 합은?
		 * Q2.	1+2+3+...+49+50=???
		 * Q3.	2의1승,2의2승,2의3승,...,2의8승
		 * 		2,4,8,16
		 * Q4.	다음을 출력하시오
		 * 		1	2	3	6
		 * 		4	5	6	15
		 * 		7	8	9	24
		 * Q5.	5+4+3+2+1=????(메소드-int sum=func(5);)
		 * Q6.	1~50까지 중, 홀수들의 합은?
		 * Q7.	1+2+3+...+m<500의 마지막 m=?무엇인가?
		 * Q8.	2의 제곱 수 중, 최초 1000을 넘는
		 * 		n=? 인가?
		 * Q9.	다음을 출력하시오
		 * 		★ ★ ★ ★ 
		 * 		★ ★ ★ 
		 * 		★ ★  
		 * 		★  
		 * Q10.	다음을 출력하시오
		 * 		　　　★ 
		 * 		　　★ ★ 
		 * 		　★ ★ ★ 
		 * 		★ ★ ★ ★ 
		 * 
		 * 		　　　★ 
		 * 		　　★ ★ ★ 
		 * 		　★ ★ ★ ★ ★ 
		 * 		★ ★ ★ ★ ★ ★ ★ 
		 * Q11.
		 * Q12.
		 * 		
		 * 
		 * 
		 * 
		 * 
		 */
//		Q1.	1~100까지의 합은?
		int sum=0;
		for(int i=1; i<=50; i++){
			sum+=i;
			if(i!=1)System.out.print("+");			
			System.out.print(i);
		}
		System.out.println("="+sum);
		System.out.println("-----------------------");
//		Q3.	2의1승,2의2승,2의3승,...,2의8승
//			1*2
//			1*2*2
//			1*2*2*2
//			1*2*2*2*2
		int sum2=1;
//		for(int m=1; m<=8; m++){
//			if(m!=1){
//				System.out.print(",");
//			}
//			sum2=1;
//			for(int n=0; n<m; n++){
//				sum2*=2;
//			}
//			System.out.print(sum2);
//		}
		for(int m=1; m<=8; m++){
			sum2*=2;
			System.out.print(sum2+" ");
		}
//		 Q4.	다음을 출력하시오
//		 * 		1	2	3	6
//		 * 		4	5	6	15
//		 * 		7	8	9	24
		System.out.println("\n-----------------------");
		int sum3=0;
		int end=0;
		int x=0;
		for(int y=0; y<3; y++){
			sum3=0;
			for(x=1+end; x<=3+end; x++){
				System.out.print(x+" ");
				sum3+=x;
			}
			end=x-1;
			System.out.println(sum3);
		}
		
	}

}
