package com.hb.day07;

public class Ex02 {

	public static void main(String[] args) {
		// 상수 - 변하지 않는 값
		// - 소스코드에서 변환하지 않는 이상
		// 		변하지 않는 값
		System.out.println(0.01);
		// 변수 - 산수 변수
		// x + y = 100; x=10; y=?
		// 변수의 선  언 : 자료형 변수명;
		// 변수의 초기화 : 변수명 = 값;
		// or 자료형 변수명 = 값;
		
		// 자료형 - 어떤값을 담을 것인가?
		// 1.10진수 정수 3;
		byte a1=127;	// -128~0~127
		short a2=3;
		int a3=3;
		long a4=3l;
		// 2.10진수 실수형 3.14;
		// 0.00001~0.00002
		// 정확한 값 2의64승
		// 1.444556e30303
		
		float b1=3.14f;
		double b2=3.14;
		
		// 3. 10진수
		// 10진수	8진수	16진수
		// 7		07		0x7
		// 8		010		0x8
		// 9		011		0x9
		// 10		012		0xa
		// 11		013		0xb
		// ...
		// 15		017		0xf
		// 16		020		0x10
		
		// 문자 - 문자 문자열
		// 문자 char
		// 자료형-3. 어떻게 표현할것인가?
		// 유니코드 (char)1 == '\u0001';
		char c1='A';
		System.out.println((char)(c1+'a'));
		// 문자열
		String d1="";
		String d2="j";
		String d3="ava";
		String d4=d2+d3+100;
		String d5=100+"";// "100"
		System.out.println(d4);
		System.out.println("java");
		
		int e1=(int)'a';
		int e2='a'-'A';
		for(int i=0; i<'z'-'a'+1;i++){
			System.out.print((char)(e1+i-e2));
		}
		
		// true || false
		// boolean형
		boolean g1=true;
		boolean g2=false;
		
		// 비교연산
		boolean g3a = 3>2;
		boolean g3b = 3>=2;
		boolean g4a = 3<2;
		boolean g4b = 3<=2;
		boolean g5 = 3==2;
		boolean g6 = 3!=2;
		
		// 논리연산
		boolean g7 = true&&true; 
		//and그리고 - 모두가 참일 경우만 참
		//				나머지는 거짓
		boolean g8 = false||false; 
		//or또는-모두가 거짓일 경우만 거짓
		//				외에는 참
		boolean g9 = !(true); // not
		
		// 증감 연산자
		
		int m=1;
		++m;// m=m+1; 사용전 +1하고 사용
		m++;// m=m+1; 사용후 +1함
		
		--m;
		m--;
		
		// =대입연산자(가장 마지막 실행)
		// =, +=, -=, *=, /=....
		
		int n=1;
		n+=2; // n=n+2;
		n-=2; // n=n-2;
		n*=2; // n=n*2;
		n/=2; // n=n/2;
		n%=2; // n=n%2;
		System.out.println();
		
		
	}
	
}









