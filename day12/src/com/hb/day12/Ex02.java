package com.hb.day12;

class Car{
	private String model;
	int speeds;
	
	public Car(String name) {
		model=name;
	}
	
	void �޸���(){
		System.out.println(model+" �ڵ����� "+speeds+"�� �޸���");
	}
	void �����(){
		System.out.println(model+" �ڵ����� "+speeds+"�� �����");
		
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Car car1=new Car("���");
		Car car2=new Car("�׷���");
//		car1.model="���";
//		car2.model="�׷���";
		car1.�޸���();
//		car2.model="��Ƽ��";
		car2.�޸���();
		
	}

}
