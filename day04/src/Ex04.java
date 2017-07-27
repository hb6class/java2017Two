class Ex04{
	public static void main(String[] args){
		//실수
	double a;
	a=3.0000000000001;
	//System.out.println(a);

	double b;
	b=4.9e-324;
	System.out.println(b);
	
	float c;
	c=3.4028235e38F;
	System.out.println(c);
	
	char d;
	d='A';
	d='b';
	System.out.println(d);

	String e;
	e="자바";
	e="java";
	System.out.println(e);
	
	//형변환
	//자동 형변환&강제 형변환
	
	System.out.println((char)(97));
	System.out.println((char)(98));
	System.out.println((char)(99));
	System.out.println((char)(100));

	//	2 -> 10
	//	2 -> 8진수
	//	2 -> 16진수
		int x=16;
		System.out.println(x);
		int y=020;
		System.out.println(y);
		int z=0x10;
		System.out.println(z);
		char i;
		i=0xac00;	//44032
		System.out.println(i);
		char j;
		j='\uac00';
		System.out.println(j);
	}
}






