package com.hb.day14;

class Animal{
	int legs=4;
	String name="동물";
	
	void walk(){
		System.out.println(name+"이(가) 걸어댕긴다");
	}
	
	void showLegs(){
		System.out.println("다리가 "+legs+"개 입니다");
	}
	
	void sayWho(){
		System.out.println(name+"입니다");
	}
	
}

class Whale extends Animal{
	public Whale() {
		name="고래";
		legs=0;
	}
	@Override
	void walk() {
		System.out.println(name+"가 해엄칩니다");
	}
}

class Kangaroo extends Animal{
	public Kangaroo() {
		name="캥거루";
		legs=2;
	}
}

class Cat extends Animal{
	public Cat() {
		name="고양이";
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
		System.out.println(name+"가 달린다");
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
		System.out.println("이름은 "+name+"입니다");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new Dog("뽀삐");
		ani.walk();
		ani.showLegs();
		Animal ani2 = new Dog("멍멍이");
		ani2.walk();
		ani2.showLegs();
		
//		Cat cat = new Cat();
//		Dog dog = new Dog("뽀삐");
//		Dog dog2 = new Dog("멍멍이");
//		dog.walk();
//		dog2.walk();
//		if(dog.equals(dog2)){
//			System.out.println("같은 종입니다");
//		}else{
//			System.out.println("다른 종입니다");
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
//			System.out.println("같은 종입니다");
//		}else{
//			System.out.println("다른 종입니다");
//		}
//		Animal ani2 = new Animal();
//		if(ani.equals(ani2)){
//			System.out.println("같은 종입니다");
//		}else{
//			System.out.println("다른 종입니다");
//		}
	}

}
