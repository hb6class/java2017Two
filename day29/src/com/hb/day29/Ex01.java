package com.hb.day29;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
		// ���
		// ip 
		// IPv4:0.0.0.0~ 0.0.0.1 ~ 255.255.255.255 -> 2�� 32�� ->42~3��
		// ����
		// �缳
		// IPv6:2����Ʈ::2����Ʈ::2����Ʈ::2����Ʈ ->2�� 64��
		// www.naver.com -> DNS���� -> 125.209.222.141
		// naver.com -> DNS���� -> 125.209.222.141
		try {
			java.net.InetAddress addr1;
			java.net.InetAddress addr2;
			java.net.InetAddress addr3;
			addr1=InetAddress.getByName("naver.com");
			addr2=InetAddress.getByName("125.209.222.141");
//			addr3=InetAddress.getByName("203.236.209.193");
//			addr3=InetAddress.getLocalHost();
//			addr3=InetAddress.getByName("localhost");
			addr3=InetAddress.getByName("localhost");
		
			System.out.println(addr1.getHostAddress());
			System.out.println(addr1.getHostName());
			System.out.println("-------------------------");
			System.out.println(addr2.getHostAddress());
			System.out.println(addr2.getHostName());
			System.out.println("-------------------------");
			System.out.println(addr3.getHostAddress());
			System.out.println(addr3.getHostName());
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}















