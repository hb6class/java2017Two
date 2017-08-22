package com.hb.day17;

import com.hb.ex.Inter01;

interface Inter07 extends Inter01{}
interface Inter77 extends Inter01{
	void func02();
}

public class Ex07 implements Inter07 {
	final int su;
	
	public Ex07() {
		su=100;
	}

	public static void main(String[] args) {
		Ex07 me = new Ex07();
		System.out.println(me.su);
		me.func01();
		me.func03();
	}
	public void func03(){
		System.out.println(su);
	}

	@Override
	public void func01() {
		System.out.println(su);
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

}
