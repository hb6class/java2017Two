package com.hb.day22;

import java.util.Calendar;
import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 6, 21, 9, 0, 0);
		System.out.println(cal.get(Calendar.YEAR)+"��");
		System.out.println(cal.get(Calendar.MONTH)+1+"��");
		System.out.println(cal.get(Calendar.DATE)+"��");
		
//		System.out.println(cal.get(Calendar.AM_PM)+".");//am:0,pm:1
//		System.out.println(cal.get(Calendar.HOUR)+"��");//0~11
		System.out.println(cal.get(Calendar.AM_PM)*12+cal.get(Calendar.HOUR)+"��");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"��");//0~23
		System.out.println(cal.get(Calendar.MINUTE)+"��");
		System.out.println(cal.get(Calendar.SECOND)+"��");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//1~7
		System.out.println("-----------------------------");//1~7
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)+"��° ��(��)");//1~7
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)+"��° ��(��)");//1~7
		Date date=cal.getTime();
		System.out.println(date);
	}

}
