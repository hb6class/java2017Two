class Ex01{

	
	public static void main(String[] args){
		func01();
		System.out.println("���α׷��� ����");
		func02(1000);
		func03(3,2);
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
	}//func01 end

	public static void func02(int su){
		System.out.println(su+"�� ���޹޾ҽ��ϴ�");
	}//func02 end

	public static void func03(int a, double b){
		System.out.println(a+"+"+b+"="+(a+b));
	}	

}//class end