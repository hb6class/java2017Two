package com.hb.day29;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex14 {

	public static void main(String[] args) {
		// server
		System.out.println("서버시작");
		String msg="";
		ServerSocket svr=null;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		BufferedInputStream bis=null;
		byte[] buff=new byte[10];
		try {
			svr=new ServerSocket(5000);
			System.out.println("서버대기중...");
			sock = svr.accept();
			is=sock.getInputStream();
			bis=new BufferedInputStream(is);
			
			os=sock.getOutputStream();

			while(true){
				int su=bis.read();
				if(su=='\r'){break;}
				os.write(su);
				
//				msg+=new String(buff,0,su);
			}
			
			
			System.out.println(msg);
			System.out.println("종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				os.close();
				is.close();
				is.close();
				sock.close();
				svr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









