package com.hb.tcp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.xml.ws.handler.MessageContext.Scope;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("server Start...");
		byte[] buf=new byte[1024];
		char[] cbuf=new char[1024];
		String msg="";
		try {
			ServerSocket serv=new ServerSocket(8080);
			System.out.println("클라이언트 접속");
			Socket sock = serv.accept();
			
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();

			OutputStreamWriter osw = new OutputStreamWriter(os);
			InputStreamReader osr=new InputStreamReader(is);
			
			while(true){
				int su=osr.read(cbuf);
				if(su==-1){break;}
				msg=new String(cbuf,0,su);
				osw.write("re:"+msg);
				osw.flush();
			}
			
//			while(true){
//				int su=is.read(buf);
//				if(su==-1){break;}
//				os.write(buf);
//				os.flush();
//			}
			
			osw.close();
			osr.close();
			os.close();
			is.close();
			sock.close();
			serv.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
