package com.hb.day14;

public class Father extends GrandFather {
	public int money=1000;
	public static int su=1111;
	
//	String color="����";
//	
//	public void func(){
//		System.out.println("�Ҿƹ����� ���");
//	}
	
	public void getMoney(int money){
		this.money-=money;
	}
	
	public void putMoney(int money){
		this.money+=money;
	}
	
	public static void showSu(){
		System.out.println(su+"�Դϴ�");
	}
	
	public void showMoney(){
		System.out.println("�ܰ� "+money+"���ֽ��ϴ�");
	}
}
