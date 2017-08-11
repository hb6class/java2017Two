package com.hb.day16;

import com.hb.day16.am.OuterStatic;
import com.hb.day16.am.OuterStatic.Inner01;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		OuterStatic outt= new OuterStatic();
//		OuterStatic.Inner01.func01();
//		OuterStatic.Inner01 inn=new OuterStatic.Inner01();
//		inn.func02();
//		/////////////////////////////////////////////////
//		Inner01.func01();
//		Inner01 inn2=new Inner01();
//		inn.func02();
		/////////////////////////////////////////////////
		Inner01 inn3 = OuterStatic.conn;
		inn3.func02();
	}

}
