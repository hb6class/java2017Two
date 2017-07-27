package java04;

class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex04실행");
		
		System.out.println(credit((70+80+90)/3.0)+"학점입니다");
	}
	
	public static void func(){
		int a=sum();
		avg();
	}
	
	public static int sum(){
		return 0;
	}
	
	public static double avg(){
		return 0.0;
	}

	public static char credit(double su){
		char show='F';
		int num=(int)(su*0.1);
		
		switch (num) {
		case 10: case 9:
			show='A';
			break;
		case 8:
			show='B';
			break;
		case 7:
			show='C';
			break;
		case 6:
			show='D';
			break;
		}
		return show;
	}
}
