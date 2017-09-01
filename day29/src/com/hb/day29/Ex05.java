package com.hb.day29;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url =new URL("http://lsdlkdsj.co.kr");
			URLConnection conn = url.openConnection();
			conn.connect();
			System.out.println(conn.getContentLength());
			System.out.println(new Date(conn.getDate()));
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
