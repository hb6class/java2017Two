package com.hb.day14;

class Animal{
	int legs=4;
	String name="����";
	
	void walk(){
		System.out.println(name+"��(��) �ɾ����");
	}
	
	void showLegs(){
		System.out.println("�ٸ��� "+legs+"�� �Դϴ�");
	}
	
	void sayWho(){
		System.out.println(name+"�Դϴ�");
	}
	
}

class Whale extends Animal{
	public Whale() {
		name="��";
		legs=0;
	}
	@Override
	void walk() {
		System.out.println(name+"�� �ؾ�Ĩ�ϴ�");
	}
}

class Kangaroo extends Animal{
	public Kangaroo() {
		name="Ļ�ŷ�";
		legs=2;
	}
}

class Cat extends Animal{
	public Cat() {
		name="�����";
	}
	@Override
	public boolean equals(Object obj) {
		String name=((Cat)obj).name;
		if(this.name.equals(name)){
			return true;
		}else{
			return false;
		}
	}
}

class Dog extends Animal{
	String name;
	public Dog(String name) {
		this.name=name;
	}
	@Override
	void walk() {
		System.out.println(name+"�� �޸���");
	}
	@Override
	public boolean equals(Object obj) {
		String name=((Animal)obj).name;
		if(super.name.equals(name)){
			return true;
		}else{
			return false;
		}
	}
	@Override
	void sayWho() {
		super.sayWho();
		System.out.println("�̸��� "+name+"�Դϴ�");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new Dog("�ǻ�");
		ani.walk();
		ani.showLegs();
		Animal ani2 = new Dog("�۸���");
		ani2.walk();
		ani2.showLegs();
		
//		Cat cat = new Cat();
//		Dog dog = new Dog("�ǻ�");
//		Dog dog2 = new Dog("�۸���");
//		dog.walk();
//		dog2.walk();
//		if(dog.equals(dog2)){
//			System.out.println("���� ���Դϴ�");
//		}else{
//			System.out.println("�ٸ� ���Դϴ�");
//		}
//		dog.sayWho();
//		dog2.sayWho();
//		cat.walk();
//		dog.walk();
//		cat.showLegs();
//		dog.showLegs();
//		Kangaroo kang=new Kangaroo();
//		kang.walk();
//		kang.showLegs();
//		Whale wha=new Whale();
//		wha.walk();
//		wha.showLegs();
//		Cat cat2=new Cat();
//		if(cat.equals(cat2)){
//			System.out.println("���� ���Դϴ�");
//		}else{
//			System.out.println("�ٸ� ���Դϴ�");
//		}
//		Animal ani2 = new Animal();
//		if(ani.equals(ani2)){
//			System.out.println("���� ���Դϴ�");
//		}else{
//			System.out.println("�ٸ� ���Դϴ�");
//		}
	}

}
