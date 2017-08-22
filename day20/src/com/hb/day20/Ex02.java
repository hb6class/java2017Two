package com.hb.day20;

interface Writer{
	void write();
}

class Pencil implements Writer{
	String color;
	public Pencil() {
		color="������";
	}
	@Override
	public void write() {
		System.out.println(color+" ���� ����ϰ� �ߴ�");
	}
}

class Pen implements Writer{
	String color;
	
	Pen(String color){
		this.color=color;
	}
	
	public void write(){
		System.out.println(color+" ���� �ߴ´�");
	}
}


//class Box<T super ArithmeticException>{
class Box<T extends Writer>{ // T, E, K, V
	T pen;
		
	void push(T obj){
		pen=obj;
	}
	
	T get(){
		return pen;
	}
}


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Pen> box=new Box<Pen>();
		Pen pen1=new Pen("������");
		Pencil pen2=new Pencil();
		box.push(pen1);
		
		Box<Pencil> box2=new Box<Pencil>();
		box2.push(pen2);
		
//		Box<Integer> box3=new Box<Integer>();
//		box3.push(1111);
		
		Pen obj1=box.get();
		Pencil obj2=box2.get();
	}

}
