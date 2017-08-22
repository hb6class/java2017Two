package com.hb.day17;

import com.hb.ex.Inter01;

class Lec08 implements Inter01{
	int su=100;

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex08 {

	public static void main(String[] args) {
//		Lec08 lec = new Lec08();
		Inter01 inter=new Inter01(){
			int su=100;

			@Override
			public void func01() {
				System.out.println(++su);
			}

			@Override
			public void func02() {
				// TODO Auto-generated method stub
				
			}
			
		};
		inter.func01();
		inter.func02();
	}

}
