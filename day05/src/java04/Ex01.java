package java04;
class Ex01{

	
	public static void main(String[] args){
		func01();
		int a=10111;
		for(a=0; a<5; a++){
			int b;
			b=a*10;
			System.out.println("b="+b);
		}
		int b=1111;
		System.out.println(b+"���α׷��� ����");
		func02(1000);
		func03(3,2);
		int sum=func04(100,10);
		System.out.println(sum);
		System.out.println(func05());
	}//main end 
	
	// c - �Լ�
	//public static void �޼ҵ��̸�(�Ű����� or ����){���๮;}
	// 1. ù���� �ҹ��ڷ� ����
	// 2. main�޼��� ȣ�� -> ����
	// 3. �̸�(�ڷ����� ��ġ), �Ű����� ������ġ
	// 4. �ϳ��� Ŭ���� ���ο��� �޼ҵ��̸� �ߺ� �Ұ���
	// 5. �Ű����� - ���� ~ ����

	public static void func01(){
		//�޼ҵ�
		System.out.println("�޼ҵ� ����������");
		return ;
	}//func01 end

	public static void func02(int su){
		System.out.println(su+"�� ���޹޾ҽ��ϴ�");
	}//func02 end

	public static void func03(int a, double b){
		System.out.println(a+"+"+b+"="+(a+b));
	}	

	public static int func04(int a, int b){
		return a*b;
	}
	
	public static String func05(){
		return "1111";
	}

}//class end