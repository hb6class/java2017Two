class Ex01{

	
	public static void main(String[] args){
		func01();
		System.out.println("프로그램의 시작");
		func02(1000);
		func03(3,2);
	}//main end 
	
	// c - 함수
	//public static void 메소드이름(매개변수 or 인자){실행문;}
	// 1. 첫글자 소문자로 시작
	// 2. main메서드 호출 -> 실행
	// 3. 이름(자료형이 일치), 매개변수 갯수일치
	// 4. 하나의 클래스 내부에서 메소드이름 중복 불가능
	// 5. 매개변수 - 없음 ~ 무한

	public static void func01(){
		//메소드
		System.out.println("메소드 시작위에서");
	}//func01 end

	public static void func02(int su){
		System.out.println(su+"를 전달받았습니다");
	}//func02 end

	public static void func03(int a, double b){
		System.out.println(a+"+"+b+"="+(a+b));
	}	

}//class end