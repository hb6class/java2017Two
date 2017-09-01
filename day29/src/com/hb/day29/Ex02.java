package com.hb.day29;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress[] addrs = InetAddress.getAllByName("www.naver.com");
			for(int i=0; i<addrs.length; i++){
				System.out.println(addrs[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
