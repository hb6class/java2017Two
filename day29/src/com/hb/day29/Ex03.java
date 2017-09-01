package com.hb.day29;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex03 {

	public static void main(String[] args) {
		// 프로토콜://ip:포트번호/패스?쿼리#레퍼런스
		try {
			java.net.URL url=new URL("https://search.naver.com:443/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=java");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getDefaultPort());//암시적
			System.out.println(url.getPort());//명시적
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getAuthority());
			System.out.println(url.getFile());
			System.out.println(url.toExternalForm());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
