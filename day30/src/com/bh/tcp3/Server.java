package com.bh.tcp3;

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
import java.util.ArrayList;

public class Server extends Thread{
	static ArrayList<Socket> list=new ArrayList<Socket>();
	Socket sock;
	
	Server(Socket sock){
		this.sock=sock;
	}
	
	@Override
	public void run() {
		InputStream is=null;
		OutputStream os=null;
		
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		String msg=null;
		while(true){
		
		try {
		for(int i=0; i<list.size(); i++){
		Socket sock=list.get(i);
			is=this.sock.getInputStream();
		os=sock.getOutputStream();
		
		isr=new InputStreamReader(is);
		osw=new OutputStreamWriter(os);
		
		br=new BufferedReader(isr);
		bw=new BufferedWriter(osw);
		pw=new PrintWriter(bw);
		
		
//				System.out.println("입력대기중...");
			msg=br.readLine();
//				System.out.println("입력받음...");
//				System.out.println("보냄...");
			pw.println(msg);
			pw.flush();
			System.out.println(msg);
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(msg==null||msg.equals("exit")){break;}
		}
		
		pw.close();
		
		try {
			br.close();
			bw.close();
			
			isr.close();
			osw.close();
			
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		int port=6060;//5000~
		System.out.println("server start");
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(port);
			while(true){
				Socket sock=serv.accept();
				System.out.println("접속됨");
				list.add(sock);
				Server conn1=new Server(sock);
				conn1.run();
			}
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
