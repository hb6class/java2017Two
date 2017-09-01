package com.hb.tcp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// client
		String msg ="";
		Scanner sc = new Scanner(System.in);
		Socket sock=null;
		byte[] buf=new byte[1024];
		char[] cbuf=new char[1024];
		try {
			sock=new Socket("localhost",8080);
			OutputStream os = sock.getOutputStream();
			InputStream is = sock.getInputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(os);
			InputStreamReader osr=new InputStreamReader(is);
			while(true){
				System.out.print(">");
				osw.write(sc.nextLine());
				osw.flush();
				int su=osr.read(cbuf);
				if(su==-1){break;}
				msg=new String(cbuf,0,su);
				if(msg.equals("re:end")){break;}
				System.out.println(msg);
			}
//			byte[] by=msg.getBytes();
//			os.write(by);
//			os.flush();
//			while(true){
//				int su=is.read(buf);
//				if(su==-1){break;}
//				msg=new String(buf,0,su);
//				System.out.println(msg);
//			}
			osw.close();
			osr.close();
			is.close();
			os.close();
			sock.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
