package com.hb.tcp5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class WebServer {

	static ArrayList<Socket> list =new ArrayList<Socket>();

	public static void main(String[] args) {
		System.out.println("server start");
		ServerSocket serv=null;
		try {
			serv=new ServerSocket(80);
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
			String txt="";
			File f=new File("google.html");
			FileReader fr=new FileReader(f);
			br=new BufferedReader(fr);
			while(true){
				String msg=br.readLine();
				if(msg==null){break;}
				txt+=msg;
			}
			for(Socket sock:WebServer.list){
				os=sock.getOutputStream();
				osw=new OutputStreamWriter(os);
				bw=new BufferedWriter(osw);
				bw.write(txt);
				bw.newLine();
				bw.flush();
			}
			WebServer.list.remove(idx);
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