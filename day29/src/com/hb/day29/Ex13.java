package com.hb.day29;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// 통신방식
		// TCP : UDP
		// TCP
		// s/c
		//socket
//		String msg="Hello Java";
		Scanner sc = new Scanner(System.in);
		Socket sock=null;
		OutputStream os=null;
		InputStream is=null;
		InputStreamReader isr=null;
		try {
			sock = new Socket("203.236.209.193",5000);
			os=sock.getOutputStream();
			is=sock.getInputStream();
			while(true){
				byte[] by=sc.nextLine().getBytes();
				
				os.write(by);
				os.flush();
				
				isr=new InputStreamReader(is);
				while(true){
					int su=isr.read();
					if(su==-1){break;}
					System.out.print((char)su);
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				isr.close();
				is.close();
				os.close();
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
