package com.hb.day20;

class Jujuba{}
class Cons{}
class Sand{}
class Bar{}

class Factory<T>{
	T obj;
	void set(T obj){
		this.obj=obj;
	}
	T get(){
		return obj;
	}
}

class Utils{
	static <T,V>Factory<T> getInst(T t,V a){
		Factory<T> fac= new Factory<T>();
		fac.set(t);
		System.out.println(a);
		return fac;
	}
}
class Utils2{
	static <T>Factory<T> getInst(T t){
		Factory<T> fac= new Factory<T>();
		fac.set(t);
		return fac;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Jujuba ice1=new Jujuba();
		Sand ice2=new Sand();
		
		Factory<Sand> fac=Utils.<Sand,Integer>getInst(ice2,1);
		Sand sand=fac.get();
//		Utils.<Sand>getInst().set(ice2);

	}

}
