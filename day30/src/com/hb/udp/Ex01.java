package com.hb.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
		// send->
		String msg="안녕하세요 자바 입니다.";
		String ip="203.236.209.193";
		int port=6060;
		DatagramSocket ds=null;
		DatagramPacket dp=null;
		try {
			ds=new DatagramSocket();
			InetAddress inet = InetAddress.getByName(ip);
			byte[] buff = msg.getBytes();
			dp=new DatagramPacket(buff, buff.length, inet, port);
			ds.send(dp);
			System.out.println("보냈음");
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
