package com.hb.day15;

abstract class ����{
	int ���� =10;
	
	abstract void �׸���();
}

class �簢�� extends ����{

	@Override
	void �׸���() {
		System.out.println("���� "+����+"cm�� �簢�� �׸���");
	}
	
}

class �� extends ����{

	@Override
	void �׸���() {
		System.out.println("���� "+(����/2)+"cm�� ������ ���� �׸���");
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		�簢�� obj1= new �簢��();
		obj1.�׸���();
		�� obj2=new ��();
		obj2.�׸���();
		���� obj3=new �簢��();
		obj3.�׸���();
	}

}
