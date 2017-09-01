package com.bh.tcp2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		int port=6060;//5000~
		System.out.println("server start");
		ServerSocket serv=null;
		InputStream is=null;
		OutputStream os=null;
		
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try {
			serv=new ServerSocket(port);
			Socket sock = serv.accept();
			System.out.println("접속됨");
			is=sock.getInputStream();
			os=sock.getOutputStream();
			
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			pw=new PrintWriter(bw);
			
			
			while(true){
//				System.out.println("입력대기중...");
				String msg=br.readLine();
//				System.out.println("입력받음...");
				if(msg==null||msg.equals("exit")){break;}
//				System.out.println("보냄...");
				pw.println(msg);
				pw.flush();
				System.out.println(msg);
			}
			
			pw.close();
			
			br.close();
			bw.close();
			
			isr.close();
			osw.close();
			
			is.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
