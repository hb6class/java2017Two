package com.hb.tcp4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	static ArrayList<Socket> list =new ArrayList<Socket>();

	public static void main(String[] args) {
		System.out.println("server start");
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(6060);
			while(true){
				Socket sock = serv.accept();
				System.out.println("connection...");
				list.add(sock);
				Engine eg=new Engine(sock,list.size()-1);
				eg.start();
			}
		} catch (IOException e) {
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

class Engine extends Thread{
	Socket sock;
	int idx;
	
	public Engine(Socket sock,int idx) {
		this.sock=sock;
		this.idx=idx;
	}
	
	@Override
	public void run() {
		InetAddress inet = sock.getInetAddress();
		System.out.println(inet.getHostAddress()+"´Ô Á¢¼Ó");
		InputStream is=null;
		OutputStream os=null;
		
		InputStreamReader isr=null;
		OutputStreamWriter osw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while(true){
				String msg=br.readLine();
				if(msg==null || msg.equals("exit")){
					break;
				}
				for(Socket sock:Server.list){
					os=sock.getOutputStream();
					osw=new OutputStreamWriter(os);
					bw=new BufferedWriter(osw);
					bw.write(msg);
					bw.newLine();
					bw.flush();
				}
			}
			Server.list.remove(idx);
			br.close();
			bw.close();
			
			isr.close();
			osw.close();
			
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}























