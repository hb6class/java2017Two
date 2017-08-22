package com.hb.day22;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar gcal=new GregorianCalendar();
		System.out.println(gcal.get(Calendar.YEAR));
		System.out.println(gcal.get(Calendar.MONTH)+1);
		System.out.println(gcal.get(Calendar.DATE));
		
		Date date = gcal.getTime();
		
		
//		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY년MM월dd일 h시m분s초");
		String date2=sdf.format(date);
		System.out.println(date2);
	}

}
