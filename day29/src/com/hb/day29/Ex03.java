package com.hb.day29;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex03 {

	public static void main(String[] args) {
		// ��������://ip:��Ʈ��ȣ/�н�?����#���۷���
		try {
			java.net.URL url=new URL("https://search.naver.com:443/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=java");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getDefaultPort());//�Ͻ���
			System.out.println(url.getPort());//�����
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
