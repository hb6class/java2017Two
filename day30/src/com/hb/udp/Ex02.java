package com.hb.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Ex02 {

	public static void main(String[] args) {
		byte[] temp=new byte[1];
		byte[] buf=new byte[1024];
		DatagramSocket ds=null;
		DatagramPacket dp=null;
		try {
			ds=new DatagramSocket(6060);
			while(true){
				dp=new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				
				System.out.println(new String(dp.getData(),0,dp.getLength()));
			}
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
