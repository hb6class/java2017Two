package com.hb.day17;

abstract class Lec03 extends Object{
	
	int su;
	public Lec03() {
		su=300;
	}
	
	void func01(){
		System.out.println("±â´É1");
	}
	
//	abstract void func02();
	
}

class Lec33 extends Lec03{}

class Num extends Number{
	Object obj;
	
	public Num(Object obj) {
//		public void setObj(Double obj) {
		this.obj = obj;
	}
	
	@Override
	public double doubleValue() {
		String msg=this.obj.toString();
		double d=((int)(Double.parseDouble(msg)*100))/100.0;
		return d;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class Ex03 extends Lec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec03 lec=new Lec03(){};
		Lec33 lec2=new Lec33();
		//////////////////
		Integer su1=100;
		su1=new Integer(100);//¿ÀÅä·¦ÇÎ
		int result=su1*2;
		result=su1.intValue()*2;//¾ð·¦ÇÎ
		System.out.println(su1.toString());
		Double su2=3.14;
		su2=new Double(3);
		System.out.println(su2.toString());
		
		Number num=3;
//		Number num2=new Double(3.14);
		Number num3=null;
		num3=1;
		System.out.println(">>>>>>>>>>>"+num3.toString());
		num3=new Integer(2);
		System.out.println(">>>>>>>>>>>"+num3.toString());
		num3=new Double(3.1423413412534235);
		System.out.println(">>>>>>>>>>>"+num3.toString());
		num3=4;
		System.out.println(">>>>>>>>>>>"+num3.toString());
		double pi=3.1423413412534235;
		Num num4=new Num(pi);
		System.out.println("result:"+num4.doubleValue());
		
		Character ch=new Character('a');
		System.out.println(ch.toString());
		
		Object obj=new Object();
		System.out.println(obj.toString());
	}

}













