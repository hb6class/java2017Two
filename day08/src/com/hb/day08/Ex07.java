package com.hb.day08;

class Kia{
	public int speeds;
	public String name;
	public String color;
	
	public void speedUp(int up){
		speeds+=up;
	}
	
	public void show(){
		System.out.println("���� "+color+name+"�� �ӵ��� "+speeds+"km�Դϴ�");
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Kia car1=null;
		car1= new Kia();
		Kia car2= new Kia();
		car1.name="���";
		car2.name="k5";
		car1.color="���";
		car2.color="������";
		car1.show();
		car2.show();
		car1.speedUp(10);
		car1.show();
		car2.show();
		car1.speedUp(20);
		car2.speedUp(50);
		car1.show();
		car2.show();
		car1=null;

	}

}
