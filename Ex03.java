class Ex03{
	public static void main(String[] args){
		//주석 - 소스팁 달기, 컴파일상에서 제외
		//System.out.println("잘나와라");
		//10진수 정수
		//int a;	//10진수 정수변수a선언 int 4바이트
		//a=100;	//a에 10을 할당(초기화-최초할당)
		//System.out.println(a);
		byte b;	//1바이트 -128~127
		byte c;
		byte d;
		b=0;
		c=b++;	// b=b+1;
		d=++b;	// b=b+1;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		short e; // 10진수 정수 
		e=32767;
		e++;
		System.out.println(e);
		int g;
		g=9223372036854775807L;
		System.out.println(g);
	}
}